package org.apache.cassandra.net;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;

import org.apache.cassandra.AbstractSerializationsTester;
import org.apache.cassandra.service.StorageService;
import org.junit.Test;

public class HeaderSerializationsTest extends AbstractSerializationsTester
{
    private static MessageSerializer messageSerializer = new MessageSerializer();

    @Test
    public void testTimestampSerialization() throws IOException
    {
      InetAddress host = InetAddress.getByName("127.0.0.1");
      Message msg = new Message(host, StorageService.Verb.READ, new byte[0],
          getVersion());

      DataOutputStream out = getOutput("net.HeaderSerialization.bin");
      messageSerializer.serialize(msg, out, getVersion());
      out.close();

      DataInputStream in = getInput("net.HeaderSerialization.bin");
      Message deserializedMsg = messageSerializer.deserialize(in, getVersion());

      assert deserializedMsg != null;
      assert msg.getCreationTime() == deserializedMsg.getCreationTime();
    }
}
