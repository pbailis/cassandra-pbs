// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g 2012-05-18 23:45:47

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE", "NODE_DESCRIBE_CLUSTER", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_SHOW_SCHEMA", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_THRIFT_INCR", "NODE_THRIFT_DECR", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_CONSISTENCY_LEVEL", "NODE_DROP_INDEX", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "NODE_LIMIT", "NODE_COLUMNS", "NODE_REVERSED", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "DESCRIBE", "EXIT", "QUIT", "SHOW", "KEYSPACES", "SCHEMA", "API_VERSION", "CREATE", "KEYSPACE", "UPDATE", "COLUMN", "FAMILY", "DROP", "INDEX", "GET", "SET", "INCR", "DECR", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "CONSISTENCYLEVEL", "IntegerPositiveLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "BY", "ON", "AND", "IntegerNegativeLiteral", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "WS", "COMMENT", "'/'", "'CLUSTER'", "'CLUSTER NAME'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'.'", "'['", "','", "']'", "'{'", "'}'", "':'", "'COLUMNS'", "'REVERSED'", "'('", "')'"
    };
    public static final int NODE_DESCRIBE=5;
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=16;
    public static final int TTL=80;
    public static final int NODE_SHOW_KEYSPACES=13;
    public static final int CONDITION=39;
    public static final int COUNT=71;
    public static final int DecimalDigit=101;
    public static final int EOF=-1;
    public static final int Identifier=77;
    public static final int NODE_UPDATE_COLUMN_FAMILY=27;
    public static final int SingleStringCharacter=93;
    public static final int NODE_USE_TABLE=7;
    public static final int NODE_DEL_KEYSPACE=24;
    public static final int CREATE=59;
    public static final int NODE_CONNECT=4;
    public static final int CONNECT=49;
    public static final int INCR=68;
    public static final int SingleEscapeCharacter=98;
    public static final int FAMILY=63;
    public static final int GET=66;
    public static final int COMMENT=104;
    public static final int SHOW=55;
    public static final int ARRAY=41;
    public static final int NODE_ADD_KEYSPACE=23;
    public static final int EXIT=53;
    public static final int NODE_COLUMNS=45;
    public static final int NODE_THRIFT_DEL=19;
    public static final int IntegerNegativeLiteral=84;
    public static final int ON=82;
    public static final int NODE_DROP_INDEX=32;
    public static final int SEMICOLON=48;
    public static final int KEYSPACES=56;
    public static final int CONDITIONS=40;
    public static final int FILE=88;
    public static final int LIST=72;
    public static final int NODE_LIMIT=44;
    public static final int NODE_DESCRIBE_CLUSTER=6;
    public static final int IP_ADDRESS=86;
    public static final int T__126=126;
    public static final int NODE_THRIFT_SET=17;
    public static final int NODE_NO_OP=10;
    public static final int T__125=125;
    public static final int NODE_ID_LIST=34;
    public static final int WS=103;
    public static final int ASSUME=74;
    public static final int NODE_THRIFT_COUNT=18;
    public static final int DESCRIBE=52;
    public static final int Alnum=92;
    public static final int CharacterEscapeSequence=95;
    public static final int NODE_SHOW_CLUSTER_NAME=11;
    public static final int USE=51;
    public static final int NODE_THRIFT_DECR=21;
    public static final int FUNCTION_CALL=38;
    public static final int EscapeSequence=94;
    public static final int Letter=90;
    public static final int DoubleLiteral=85;
    public static final int HELP=50;
    public static final int HexEscapeSequence=96;
    public static final int NODE_EXIT=8;
    public static final int LIMIT=89;
    public static final int T__118=118;
    public static final int DEL=70;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int NODE_SHOW_SCHEMA=14;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int NODE_LIST=28;
    public static final int UPDATE=61;
    public static final int T__122=122;
    public static final int NODE_UPDATE_KEYSPACE=26;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int AND=83;
    public static final int NODE_NEW_CF_ACCESS=35;
    public static final int CONSISTENCYLEVEL=75;
    public static final int HexDigit=102;
    public static final int QUIT=54;
    public static final int NODE_TRUNCATE=29;
    public static final int INDEX=65;
    public static final int NODE_SHOW_VERSION=12;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int NODE_NEW_KEYSPACE_ACCESS=36;
    public static final int T__109=109;
    public static final int NODE_REVERSED=46;
    public static final int TRUNCATE=73;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int COLUMN=62;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int EscapeCharacter=100;
    public static final int T__112=112;
    public static final int PAIR=43;
    public static final int NODE_CONSISTENCY_LEVEL=31;
    public static final int WITH=79;
    public static final int BY=81;
    public static final int UnicodeEscapeSequence=97;
    public static final int HASH=42;
    public static final int SET=67;
    public static final int Digit=91;
    public static final int API_VERSION=58;
    public static final int NODE_ASSUME=30;
    public static final int CONVERT_TO_TYPE=37;
    public static final int NODE_THRIFT_GET=15;
    public static final int NODE_DEL_COLUMN_FAMILY=25;
    public static final int NODE_KEY_RANGE=47;
    public static final int KEYSPACE=60;
    public static final int StringLiteral=78;
    public static final int NODE_HELP=9;
    public static final int CONFIG=87;
    public static final int IntegerPositiveLiteral=76;
    public static final int SCHEMA=57;
    public static final int DROP=64;
    public static final int NonEscapeCharacter=99;
    public static final int DECR=69;
    public static final int NODE_ADD_COLUMN_FAMILY=22;
    public static final int NODE_THRIFT_INCR=20;
    public static final int NODE_COLUMN_ACCESS=33;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g"; }


        public void reportError(RecognitionException e) 
        {
            String errorMessage;

            if (e instanceof NoViableAltException)
            {
                errorMessage = "Command not found: `" + this.input + "`. Type 'help;' or '?' for help.";
            }
            else
            {
                errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());
            }

            throw new RuntimeException(errorMessage);
        }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:142:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:142:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:142:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root435);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:142:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:144:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.describeCluster_return describeCluster8 = null;

        CliParser.addKeyspace_return addKeyspace9 = null;

        CliParser.addColumnFamily_return addColumnFamily10 = null;

        CliParser.updateKeyspace_return updateKeyspace11 = null;

        CliParser.updateColumnFamily_return updateColumnFamily12 = null;

        CliParser.delColumnFamily_return delColumnFamily13 = null;

        CliParser.delKeyspace_return delKeyspace14 = null;

        CliParser.useKeyspace_return useKeyspace15 = null;

        CliParser.delStatement_return delStatement16 = null;

        CliParser.getStatement_return getStatement17 = null;

        CliParser.helpStatement_return helpStatement18 = null;

        CliParser.setStatement_return setStatement19 = null;

        CliParser.incrStatement_return incrStatement20 = null;

        CliParser.showStatement_return showStatement21 = null;

        CliParser.listStatement_return listStatement22 = null;

        CliParser.truncateStatement_return truncateStatement23 = null;

        CliParser.assumeStatement_return assumeStatement24 = null;

        CliParser.consistencyLevelStatement_return consistencyLevelStatement25 = null;

        CliParser.dropIndex_return dropIndex26 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:145:5: ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) )
            int alt2=24;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:145:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement456);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:146:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement464);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:147:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement472);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:148:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement480);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:149:7: describeCluster
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeCluster_in_statement488);
                    describeCluster8=describeCluster();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeCluster8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:150:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement496);
                    addKeyspace9=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:151:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement504);
                    addColumnFamily10=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:152:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement512);
                    updateKeyspace11=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:153:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement520);
                    updateColumnFamily12=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:154:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement528);
                    delColumnFamily13=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily13.getTree());

                    }
                    break;
                case 11 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:155:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement536);
                    delKeyspace14=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:156:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement544);
                    useKeyspace15=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace15.getTree());

                    }
                    break;
                case 13 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:157:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement552);
                    delStatement16=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement16.getTree());

                    }
                    break;
                case 14 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:158:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement560);
                    getStatement17=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement17.getTree());

                    }
                    break;
                case 15 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:159:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement568);
                    helpStatement18=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:160:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement576);
                    setStatement19=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:161:7: incrStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_incrStatement_in_statement584);
                    incrStatement20=incrStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incrStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:162:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement592);
                    showStatement21=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:163:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement600);
                    listStatement22=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:164:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement608);
                    truncateStatement23=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement23.getTree());

                    }
                    break;
                case 21 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:165:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement616);
                    assumeStatement24=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement24.getTree());

                    }
                    break;
                case 22 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:166:7: consistencyLevelStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_consistencyLevelStatement_in_statement624);
                    consistencyLevelStatement25=consistencyLevelStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, consistencyLevelStatement25.getTree());

                    }
                    break;
                case 23 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:167:7: dropIndex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dropIndex_in_statement632);
                    dropIndex26=dropIndex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dropIndex26.getTree());

                    }
                    break;
                case 24 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:168:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 168:7: -> ^( NODE_NO_OP )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:168:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:171:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT27=null;
        Token char_literal29=null;
        Token CONNECT33=null;
        Token char_literal35=null;
        CliParser.host_return host28 = null;

        CliParser.port_return port30 = null;

        CliParser.username_return username31 = null;

        CliParser.password_return password32 = null;

        CliParser.ip_address_return ip_address34 = null;

        CliParser.port_return port36 = null;

        CliParser.username_return username37 = null;

        CliParser.password_return password38 = null;


        CommonTree CONNECT27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree CONNECT33_tree=null;
        CommonTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:172:5: ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:172:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT27=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT27);

                    pushFollow(FOLLOW_host_in_connectStatement663);
                    host28=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host28.getTree());
                    char_literal29=(Token)match(input,105,FOLLOW_105_in_connectStatement665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(char_literal29);

                    pushFollow(FOLLOW_port_in_connectStatement667);
                    port30=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port30.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:172:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:172:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement670);
                            username31=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username31.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement672);
                            password32=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password32.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: username, password, port, host
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:9: -> ^( NODE_CONNECT host port ( username password )? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:173:12: ^( NODE_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:173:37: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:174:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT33=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT33);

                    pushFollow(FOLLOW_ip_address_in_connectStatement709);
                    ip_address34=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address34.getTree());
                    char_literal35=(Token)match(input,105,FOLLOW_105_in_connectStatement711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(char_literal35);

                    pushFollow(FOLLOW_port_in_connectStatement713);
                    port36=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port36.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:174:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:174:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement716);
                            username37=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username37.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement718);
                            password38=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password38.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: port, username, ip_address, password
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 175:9: -> ^( NODE_CONNECT ip_address port ( username password )? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:175:12: ^( NODE_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:175:43: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:178:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP39=null;
        Token HELP40=null;
        Token HELP41=null;
        Token CONNECT42=null;
        Token HELP43=null;
        Token USE44=null;
        Token HELP45=null;
        Token DESCRIBE46=null;
        Token HELP47=null;
        Token DESCRIBE48=null;
        Token string_literal49=null;
        Token HELP50=null;
        Token EXIT51=null;
        Token HELP52=null;
        Token QUIT53=null;
        Token HELP54=null;
        Token SHOW55=null;
        Token string_literal56=null;
        Token HELP57=null;
        Token SHOW58=null;
        Token KEYSPACES59=null;
        Token HELP60=null;
        Token SHOW61=null;
        Token SCHEMA62=null;
        Token HELP63=null;
        Token SHOW64=null;
        Token API_VERSION65=null;
        Token HELP66=null;
        Token CREATE67=null;
        Token KEYSPACE68=null;
        Token HELP69=null;
        Token UPDATE70=null;
        Token KEYSPACE71=null;
        Token HELP72=null;
        Token CREATE73=null;
        Token COLUMN74=null;
        Token FAMILY75=null;
        Token HELP76=null;
        Token UPDATE77=null;
        Token COLUMN78=null;
        Token FAMILY79=null;
        Token HELP80=null;
        Token DROP81=null;
        Token KEYSPACE82=null;
        Token HELP83=null;
        Token DROP84=null;
        Token COLUMN85=null;
        Token FAMILY86=null;
        Token HELP87=null;
        Token DROP88=null;
        Token INDEX89=null;
        Token HELP90=null;
        Token GET91=null;
        Token HELP92=null;
        Token SET93=null;
        Token HELP94=null;
        Token INCR95=null;
        Token HELP96=null;
        Token DECR97=null;
        Token HELP98=null;
        Token DEL99=null;
        Token HELP100=null;
        Token COUNT101=null;
        Token HELP102=null;
        Token LIST103=null;
        Token HELP104=null;
        Token TRUNCATE105=null;
        Token HELP106=null;
        Token ASSUME107=null;
        Token HELP108=null;
        Token CONSISTENCYLEVEL109=null;
        Token HELP110=null;
        Token char_literal111=null;

        CommonTree HELP39_tree=null;
        CommonTree HELP40_tree=null;
        CommonTree HELP41_tree=null;
        CommonTree CONNECT42_tree=null;
        CommonTree HELP43_tree=null;
        CommonTree USE44_tree=null;
        CommonTree HELP45_tree=null;
        CommonTree DESCRIBE46_tree=null;
        CommonTree HELP47_tree=null;
        CommonTree DESCRIBE48_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree HELP50_tree=null;
        CommonTree EXIT51_tree=null;
        CommonTree HELP52_tree=null;
        CommonTree QUIT53_tree=null;
        CommonTree HELP54_tree=null;
        CommonTree SHOW55_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree HELP57_tree=null;
        CommonTree SHOW58_tree=null;
        CommonTree KEYSPACES59_tree=null;
        CommonTree HELP60_tree=null;
        CommonTree SHOW61_tree=null;
        CommonTree SCHEMA62_tree=null;
        CommonTree HELP63_tree=null;
        CommonTree SHOW64_tree=null;
        CommonTree API_VERSION65_tree=null;
        CommonTree HELP66_tree=null;
        CommonTree CREATE67_tree=null;
        CommonTree KEYSPACE68_tree=null;
        CommonTree HELP69_tree=null;
        CommonTree UPDATE70_tree=null;
        CommonTree KEYSPACE71_tree=null;
        CommonTree HELP72_tree=null;
        CommonTree CREATE73_tree=null;
        CommonTree COLUMN74_tree=null;
        CommonTree FAMILY75_tree=null;
        CommonTree HELP76_tree=null;
        CommonTree UPDATE77_tree=null;
        CommonTree COLUMN78_tree=null;
        CommonTree FAMILY79_tree=null;
        CommonTree HELP80_tree=null;
        CommonTree DROP81_tree=null;
        CommonTree KEYSPACE82_tree=null;
        CommonTree HELP83_tree=null;
        CommonTree DROP84_tree=null;
        CommonTree COLUMN85_tree=null;
        CommonTree FAMILY86_tree=null;
        CommonTree HELP87_tree=null;
        CommonTree DROP88_tree=null;
        CommonTree INDEX89_tree=null;
        CommonTree HELP90_tree=null;
        CommonTree GET91_tree=null;
        CommonTree HELP92_tree=null;
        CommonTree SET93_tree=null;
        CommonTree HELP94_tree=null;
        CommonTree INCR95_tree=null;
        CommonTree HELP96_tree=null;
        CommonTree DECR97_tree=null;
        CommonTree HELP98_tree=null;
        CommonTree DEL99_tree=null;
        CommonTree HELP100_tree=null;
        CommonTree COUNT101_tree=null;
        CommonTree HELP102_tree=null;
        CommonTree LIST103_tree=null;
        CommonTree HELP104_tree=null;
        CommonTree TRUNCATE105_tree=null;
        CommonTree HELP106_tree=null;
        CommonTree ASSUME107_tree=null;
        CommonTree HELP108_tree=null;
        CommonTree CONSISTENCYLEVEL109_tree=null;
        CommonTree HELP110_tree=null;
        CommonTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:179:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt6=30;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:179:7: HELP HELP
                    {
                    HELP39=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP39);

                    HELP40=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:180:12: ^( NODE_HELP NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:181:7: HELP CONNECT
                    {
                    HELP41=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP41);

                    CONNECT42=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 182:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:182:12: ^( NODE_HELP NODE_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:183:7: HELP USE
                    {
                    HELP43=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP43);

                    USE44=(Token)match(input,USE,FOLLOW_USE_in_helpStatement818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:184:12: ^( NODE_HELP NODE_USE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP DESCRIBE
                    {
                    HELP45=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP45);

                    DESCRIBE46=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( NODE_HELP NODE_DESCRIBE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_DESCRIBE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE, "NODE_DESCRIBE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP DESCRIBE 'CLUSTER'
                    {
                    HELP47=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP47);

                    DESCRIBE48=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE48);

                    string_literal49=(Token)match(input,106,FOLLOW_106_in_helpStatement873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(string_literal49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP EXIT
                    {
                    HELP50=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP50);

                    EXIT51=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP QUIT
                    {
                    HELP52=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP52);

                    QUIT53=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP SHOW 'CLUSTER NAME'
                    {
                    HELP54=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP54);

                    SHOW55=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW55);

                    string_literal56=(Token)match(input,107,FOLLOW_107_in_helpStatement955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal56);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP SHOW KEYSPACES
                    {
                    HELP57=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP57);

                    SHOW58=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW58);

                    KEYSPACES59=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:196:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP SHOW SCHEMA
                    {
                    HELP60=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP60);

                    SHOW61=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW61);

                    SCHEMA62=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_helpStatement1012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:13: -> ^( NODE_HELP NODE_SHOW_SCHEMA )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:198:16: ^( NODE_HELP NODE_SHOW_SCHEMA )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP SHOW API_VERSION
                    {
                    HELP63=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP63);

                    SHOW64=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW64);

                    API_VERSION65=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_helpStatement1044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP CREATE KEYSPACE
                    {
                    HELP66=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP66);

                    CREATE67=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE67);

                    KEYSPACE68=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP UPDATE KEYSPACE
                    {
                    HELP69=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP69);

                    UPDATE70=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE70);

                    KEYSPACE71=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP72=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP72);

                    CREATE73=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE73);

                    COLUMN74=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN74);

                    FAMILY75=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP76=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP76);

                    UPDATE77=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE77);

                    COLUMN78=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN78);

                    FAMILY79=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:208:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP DROP KEYSPACE
                    {
                    HELP80=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP80);

                    DROP81=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP81);

                    KEYSPACE82=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP DROP COLUMN FAMILY
                    {
                    HELP83=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP83);

                    DROP84=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP84);

                    COLUMN85=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN85);

                    FAMILY86=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:213:7: HELP DROP INDEX
                    {
                    HELP87=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP87);

                    DROP88=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP88);

                    INDEX89=(Token)match(input,INDEX,FOLLOW_INDEX_in_helpStatement1250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDEX.add(INDEX89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( NODE_HELP NODE_DROP_INDEX )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP NODE_DROP_INDEX )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:215:7: HELP GET
                    {
                    HELP90=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP90);

                    GET91=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:216:12: ^( NODE_HELP NODE_THRIFT_GET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:217:7: HELP SET
                    {
                    HELP92=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP92);

                    SET93=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:218:12: ^( NODE_HELP NODE_THRIFT_SET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:219:7: HELP INCR
                    {
                    HELP94=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP94);

                    INCR95=(Token)match(input,INCR,FOLLOW_INCR_in_helpStatement1330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:9: -> ^( NODE_HELP NODE_THRIFT_INCR )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:220:12: ^( NODE_HELP NODE_THRIFT_INCR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:221:7: HELP DECR
                    {
                    HELP96=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP96);

                    DECR97=(Token)match(input,DECR,FOLLOW_DECR_in_helpStatement1356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR97);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:9: -> ^( NODE_HELP NODE_THRIFT_DECR )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:222:12: ^( NODE_HELP NODE_THRIFT_DECR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:223:7: HELP DEL
                    {
                    HELP98=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP98);

                    DEL99=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 224:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:224:12: ^( NODE_HELP NODE_THRIFT_DEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:225:7: HELP COUNT
                    {
                    HELP100=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP100);

                    COUNT101=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:226:12: ^( NODE_HELP NODE_THRIFT_COUNT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:227:7: HELP LIST
                    {
                    HELP102=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP102);

                    LIST103=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:228:12: ^( NODE_HELP NODE_LIST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:229:7: HELP TRUNCATE
                    {
                    HELP104=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP104);

                    TRUNCATE105=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE105);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:230:12: ^( NODE_HELP NODE_TRUNCATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:231:7: HELP ASSUME
                    {
                    HELP106=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP106);

                    ASSUME107=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME107);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:232:12: ^( NODE_HELP NODE_ASSUME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:233:7: HELP CONSISTENCYLEVEL
                    {
                    HELP108=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP108);

                    CONSISTENCYLEVEL109=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_helpStatement1515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:9: -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:234:12: ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:235:7: HELP
                    {
                    HELP110=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:9: -> ^( NODE_HELP )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:236:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:237:7: '?'
                    {
                    char_literal111=(Token)match(input,108,FOLLOW_108_in_helpStatement1562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(char_literal111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:9: -> ^( NODE_HELP )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:238:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:241:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT112=null;
        Token EXIT113=null;

        CommonTree QUIT112_tree=null;
        CommonTree EXIT113_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:242:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:242:7: QUIT
                    {
                    QUIT112=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 242:12: -> ^( NODE_EXIT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:242:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:243:7: EXIT
                    {
                    EXIT113=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 243:12: -> ^( NODE_EXIT )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:243:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class getStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:246:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET114=null;
        Token string_literal116=null;
        Token string_literal118=null;
        Token GET119=null;
        Token string_literal121=null;
        Token string_literal123=null;
        Token string_literal125=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr115 = null;

        CliParser.typeIdentifier_return typeIdentifier117 = null;

        CliParser.columnFamily_return columnFamily120 = null;

        CliParser.getCondition_return getCondition122 = null;

        CliParser.getCondition_return getCondition124 = null;


        CommonTree limit_tree=null;
        CommonTree GET114_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree GET119_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GET) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=IntegerPositiveLiteral && LA12_1<=StringLiteral)||LA12_1==IntegerNegativeLiteral) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==117) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==110) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:7: GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET114=(Token)match(input,GET,FOLLOW_GET_in_getStatement1634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET114);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1636);
                    columnFamilyExpr115=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr115.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:28: ( 'AS' typeIdentifier )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==109) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:29: 'AS' typeIdentifier
                            {
                            string_literal116=(Token)match(input,109,FOLLOW_109_in_getStatement1639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_109.add(string_literal116);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1641);
                            typeIdentifier117=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier117.getTree());

                            }
                            break;

                    }

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:51: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==LIMIT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:247:52: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal118=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1646); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal118);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1650); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: typeIdentifier, limit, columnFamilyExpr
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:248:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:248:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:248:49: ^( CONVERT_TO_TYPE typeIdentifier )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERT_TO_TYPE, "CONVERT_TO_TYPE"), root_2);

                            adaptor.addChild(root_2, stream_typeIdentifier.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_typeIdentifier.reset();
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:248:86: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:248:86: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:249:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET119=(Token)match(input,GET,FOLLOW_GET_in_getStatement1695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET119);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1697);
                    columnFamily120=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily120.getTree());
                    string_literal121=(Token)match(input,110,FOLLOW_110_in_getStatement1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(string_literal121);

                    pushFollow(FOLLOW_getCondition_in_getStatement1701);
                    getCondition122=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition122.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:249:45: ( 'AND' getCondition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==AND) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:249:46: 'AND' getCondition
                    	    {
                    	    string_literal123=(Token)match(input,AND,FOLLOW_AND_in_getStatement1704); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal123);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1706);
                    	    getCondition124=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:249:67: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LIMIT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:249:68: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal125=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1711); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal125);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1715); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: getCondition, limit, columnFamily
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 250:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:250:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:250:59: ^( CONDITIONS ( getCondition )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);

                        if ( !(stream_getCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_getCondition.hasNext() ) {
                            adaptor.addChild(root_2, stream_getCondition.nextTree());

                        }
                        stream_getCondition.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:250:87: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:250:87: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStatement"

    public static class getCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getCondition"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:253:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn126 = null;

        CliParser.operator_return operator127 = null;

        CliParser.value_return value128 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:254:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:254:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1766);
            columnOrSuperColumn126=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn126.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1768);
            operator127=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator127.getTree());
            pushFollow(FOLLOW_value_in_getCondition1770);
            value128=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value128.getTree());


            // AST REWRITE
            // elements: value, operator, columnOrSuperColumn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 255:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:255:12: ^( CONDITION operator columnOrSuperColumn value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_operator.nextTree());
                adaptor.addChild(root_1, stream_columnOrSuperColumn.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getCondition"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:258:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set129=null;

        CommonTree set129_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:259:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set129=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=115) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set129));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:262:1: typeIdentifier : ( Identifier | StringLiteral | IntegerPositiveLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set130=null;

        CommonTree set130_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:263:5: ( Identifier | StringLiteral | IntegerPositiveLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set130=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set130));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class setStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:266:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ttlValue=null;
        Token SET131=null;
        Token char_literal133=null;
        Token WITH134=null;
        Token TTL135=null;
        Token char_literal136=null;
        CliParser.value_return objectValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr132 = null;


        CommonTree ttlValue_tree=null;
        CommonTree SET131_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree WITH134_tree=null;
        CommonTree TTL135_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:267:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:267:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            {
            SET131=(Token)match(input,SET,FOLLOW_SET_in_setStatement1866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET131);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement1868);
            columnFamilyExpr132=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr132.getTree());
            char_literal133=(Token)match(input,111,FOLLOW_111_in_setStatement1870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(char_literal133);

            pushFollow(FOLLOW_value_in_setStatement1874);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:267:50: ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WITH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:267:51: WITH TTL '=' ttlValue= IntegerPositiveLiteral
                    {
                    WITH134=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement1877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH134);

                    TTL135=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL135);

                    char_literal136=(Token)match(input,111,FOLLOW_111_in_setStatement1881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(char_literal136);

                    ttlValue=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_setStatement1885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(ttlValue);


                    }
                    break;

            }



            // AST REWRITE
            // elements: columnFamilyExpr, objectValue, ttlValue
            // token labels: ttlValue
            // rule labels: retval, objectValue
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_ttlValue=new RewriteRuleTokenStream(adaptor,"token ttlValue",ttlValue);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_objectValue=new RewriteRuleSubtreeStream(adaptor,"rule objectValue",objectValue!=null?objectValue.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 268:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:268:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:268:60: ( $ttlValue)?
                if ( stream_ttlValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_ttlValue.nextNode());

                }
                stream_ttlValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStatement"

    public static class incrStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:271:1: incrStatement : ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) );
    public final CliParser.incrStatement_return incrStatement() throws RecognitionException {
        CliParser.incrStatement_return retval = new CliParser.incrStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCR137=null;
        Token BY139=null;
        Token DECR140=null;
        Token BY142=null;
        CliParser.incrementValue_return byValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr138 = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr141 = null;


        CommonTree INCR137_tree=null;
        CommonTree BY139_tree=null;
        CommonTree DECR140_tree=null;
        CommonTree BY142_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_incrementValue=new RewriteRuleSubtreeStream(adaptor,"rule incrementValue");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:272:5: ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INCR) ) {
                alt16=1;
            }
            else if ( (LA16_0==DECR) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:272:7: INCR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    INCR137=(Token)match(input,INCR,FOLLOW_INCR_in_incrStatement1931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR137);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement1933);
                    columnFamilyExpr138=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr138.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:272:29: ( BY byValue= incrementValue )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==BY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:272:30: BY byValue= incrementValue
                            {
                            BY139=(Token)match(input,BY,FOLLOW_BY_in_incrStatement1936); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY139);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement1940);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, byValue
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:9: -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:273:12: ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:273:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:274:7: DECR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    DECR140=(Token)match(input,DECR,FOLLOW_DECR_in_incrStatement1974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR140);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement1976);
                    columnFamilyExpr141=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr141.getTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:274:29: ( BY byValue= incrementValue )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==BY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:274:30: BY byValue= incrementValue
                            {
                            BY142=(Token)match(input,BY,FOLLOW_BY_in_incrStatement1979); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY142);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement1983);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, byValue
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 275:9: -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                    {
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:275:12: ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:275:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrStatement"

    public static class countStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:278:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT143=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr144 = null;


        CommonTree COUNT143_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:279:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:279:7: COUNT columnFamilyExpr
            {
            COUNT143=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement2026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT143);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement2028);
            columnFamilyExpr144=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr144.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:280:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "countStatement"

    public static class delStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:283:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL145=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr146 = null;


        CommonTree DEL145_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:284:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:284:7: DEL columnFamilyExpr
            {
            DEL145=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement2062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL145);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement2064);
            columnFamilyExpr146=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr146.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:285:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:288:1: showStatement : ( showClusterName | showVersion | showKeyspaces | showSchema );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName147 = null;

        CliParser.showVersion_return showVersion148 = null;

        CliParser.showKeyspaces_return showKeyspaces149 = null;

        CliParser.showSchema_return showSchema150 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:289:5: ( showClusterName | showVersion | showKeyspaces | showSchema )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case 107:
                    {
                    alt17=1;
                    }
                    break;
                case API_VERSION:
                    {
                    alt17=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt17=3;
                    }
                    break;
                case SCHEMA:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:289:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement2098);
                    showClusterName147=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName147.getTree());

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:290:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement2106);
                    showVersion148=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion148.getTree());

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:291:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement2114);
                    showKeyspaces149=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces149.getTree());

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:292:7: showSchema
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showSchema_in_showStatement2122);
                    showSchema150=showSchema();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showSchema150.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class listStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:295:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LIST151=null;
        CliParser.columnFamily_return columnFamily152 = null;

        CliParser.keyRangeExpr_return keyRangeExpr153 = null;

        CliParser.rowLimitExpr_return rowLimitExpr154 = null;

        CliParser.columnLimitExpr_return columnLimitExpr155 = null;


        CommonTree LIST151_tree=null;
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleSubtreeStream stream_rowLimitExpr=new RewriteRuleSubtreeStream(adaptor,"rule rowLimitExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_columnLimitExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnLimitExpr");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:296:5: ( LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:296:7: LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )?
            {
            LIST151=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement2139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST151);

            pushFollow(FOLLOW_columnFamily_in_listStatement2141);
            columnFamily152=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily152.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:296:25: ( keyRangeExpr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==117) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement2143);
                    keyRangeExpr153=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr153.getTree());

                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:296:39: ( rowLimitExpr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LIMIT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: rowLimitExpr
                    {
                    pushFollow(FOLLOW_rowLimitExpr_in_listStatement2146);
                    rowLimitExpr154=rowLimitExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rowLimitExpr.add(rowLimitExpr154.getTree());

                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:296:53: ( columnLimitExpr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==123) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: columnLimitExpr
                    {
                    pushFollow(FOLLOW_columnLimitExpr_in_listStatement2149);
                    columnLimitExpr155=columnLimitExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnLimitExpr.add(columnLimitExpr155.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: rowLimitExpr, columnFamily, keyRangeExpr, columnLimitExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:297:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:297:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:297:51: ( rowLimitExpr )?
                if ( stream_rowLimitExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_rowLimitExpr.nextTree());

                }
                stream_rowLimitExpr.reset();
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:297:65: ( columnLimitExpr )?
                if ( stream_columnLimitExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnLimitExpr.nextTree());

                }
                stream_columnLimitExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listStatement"

    public static class truncateStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "truncateStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:300:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE156=null;
        CliParser.columnFamily_return columnFamily157 = null;


        CommonTree TRUNCATE156_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:301:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:301:7: TRUNCATE columnFamily
            {
            TRUNCATE156=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement2192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE156);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement2194);
            columnFamily157=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily157.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 302:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:302:12: ^( NODE_TRUNCATE columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "truncateStatement"

    public static class assumeStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assumeStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:305:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' entityName -> ^( NODE_ASSUME columnFamily $assumptionElement entityName ) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token ASSUME158=null;
        Token string_literal160=null;
        CliParser.columnFamily_return columnFamily159 = null;

        CliParser.entityName_return entityName161 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree ASSUME158_tree=null;
        CommonTree string_literal160_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:306:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' entityName -> ^( NODE_ASSUME columnFamily $assumptionElement entityName ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:306:7: ASSUME columnFamily assumptionElement= Identifier 'AS' entityName
            {
            ASSUME158=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement2227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME158);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement2229);
            columnFamily159=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily159.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement2233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal160=(Token)match(input,109,FOLLOW_109_in_assumeStatement2235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal160);

            pushFollow(FOLLOW_entityName_in_assumeStatement2237);
            entityName161=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName161.getTree());


            // AST REWRITE
            // elements: assumptionElement, entityName, columnFamily
            // token labels: assumptionElement
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_assumptionElement=new RewriteRuleTokenStream(adaptor,"token assumptionElement",assumptionElement);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 307:9: -> ^( NODE_ASSUME columnFamily $assumptionElement entityName )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:307:12: ^( NODE_ASSUME columnFamily $assumptionElement entityName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_assumptionElement.nextNode());
                adaptor.addChild(root_1, stream_entityName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assumeStatement"

    public static class consistencyLevelStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consistencyLevelStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:310:1: consistencyLevelStatement : CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) ;
    public final CliParser.consistencyLevelStatement_return consistencyLevelStatement() throws RecognitionException {
        CliParser.consistencyLevelStatement_return retval = new CliParser.consistencyLevelStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token defaultType=null;
        Token CONSISTENCYLEVEL162=null;
        Token string_literal163=null;

        CommonTree defaultType_tree=null;
        CommonTree CONSISTENCYLEVEL162_tree=null;
        CommonTree string_literal163_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:311:5: ( CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:311:7: CONSISTENCYLEVEL 'AS' defaultType= Identifier
            {
            CONSISTENCYLEVEL162=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL162);

            string_literal163=(Token)match(input,109,FOLLOW_109_in_consistencyLevelStatement2277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal163);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_consistencyLevelStatement2281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType
            // token labels: defaultType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 312:9: -> ^( NODE_CONSISTENCY_LEVEL $defaultType)
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:312:12: ^( NODE_CONSISTENCY_LEVEL $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"), root_1);

                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consistencyLevelStatement"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:315:1: showClusterName : SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW164=null;
        Token string_literal165=null;

        CommonTree SHOW164_tree=null;
        CommonTree string_literal165_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:316:5: ( SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:316:7: SHOW 'CLUSTER NAME'
            {
            SHOW164=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName2315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW164);

            string_literal165=(Token)match(input,107,FOLLOW_107_in_showClusterName2317); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal165);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 317:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:317:12: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class addKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addKeyspace"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:320:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE166=null;
        Token KEYSPACE167=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr168 = null;


        CommonTree CREATE166_tree=null;
        CommonTree KEYSPACE167_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:321:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:321:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE166=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace2348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE166);

            KEYSPACE167=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace2350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE167);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace2352);
            keyValuePairExpr168=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr168.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 322:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:322:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addKeyspace"

    public static class addColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addColumnFamily"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:325:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE169=null;
        Token COLUMN170=null;
        Token FAMILY171=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr172 = null;


        CommonTree CREATE169_tree=null;
        CommonTree COLUMN170_tree=null;
        CommonTree FAMILY171_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:326:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:326:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE169=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily2386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE169);

            COLUMN170=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily2388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN170);

            FAMILY171=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily2390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY171);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily2392);
            keyValuePairExpr172=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr172.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:327:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addColumnFamily"

    public static class updateKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateKeyspace"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:330:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE173=null;
        Token KEYSPACE174=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr175 = null;


        CommonTree UPDATE173_tree=null;
        CommonTree KEYSPACE174_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:331:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:331:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE173=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE173);

            KEYSPACE174=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE174);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2430);
            keyValuePairExpr175=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr175.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 332:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:332:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateKeyspace"

    public static class updateColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnFamily"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:335:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE176=null;
        Token COLUMN177=null;
        Token FAMILY178=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr179 = null;


        CommonTree UPDATE176_tree=null;
        CommonTree COLUMN177_tree=null;
        CommonTree FAMILY178_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:336:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:336:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE176=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE176);

            COLUMN177=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN177);

            FAMILY178=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY178);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2469);
            keyValuePairExpr179=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr179.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:337:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnFamily"

    public static class delKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delKeyspace"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:340:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP180=null;
        Token KEYSPACE181=null;
        CliParser.keyspace_return keyspace182 = null;


        CommonTree DROP180_tree=null;
        CommonTree KEYSPACE181_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:341:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:341:7: DROP KEYSPACE keyspace
            {
            DROP180=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP180);

            KEYSPACE181=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE181);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2506);
            keyspace182=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace182.getTree());


            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 342:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:342:12: ^( NODE_DEL_KEYSPACE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delKeyspace"

    public static class delColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delColumnFamily"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:345:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP183=null;
        Token COLUMN184=null;
        Token FAMILY185=null;
        CliParser.columnFamily_return columnFamily186 = null;


        CommonTree DROP183_tree=null;
        CommonTree COLUMN184_tree=null;
        CommonTree FAMILY185_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:346:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:346:7: DROP COLUMN FAMILY columnFamily
            {
            DROP183=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP183);

            COLUMN184=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN184);

            FAMILY185=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY185);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2546);
            columnFamily186=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily186.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 347:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:347:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delColumnFamily"

    public static class dropIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dropIndex"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:350:1: dropIndex : DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) ;
    public final CliParser.dropIndex_return dropIndex() throws RecognitionException {
        CliParser.dropIndex_return retval = new CliParser.dropIndex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP187=null;
        Token INDEX188=null;
        Token ON189=null;
        Token char_literal191=null;
        CliParser.columnFamily_return columnFamily190 = null;

        CliParser.columnName_return columnName192 = null;


        CommonTree DROP187_tree=null;
        CommonTree INDEX188_tree=null;
        CommonTree ON189_tree=null;
        CommonTree char_literal191_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:351:5: ( DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:351:7: DROP INDEX ON columnFamily '.' columnName
            {
            DROP187=(Token)match(input,DROP,FOLLOW_DROP_in_dropIndex2580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP187);

            INDEX188=(Token)match(input,INDEX,FOLLOW_INDEX_in_dropIndex2582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEX.add(INDEX188);

            ON189=(Token)match(input,ON,FOLLOW_ON_in_dropIndex2584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ON.add(ON189);

            pushFollow(FOLLOW_columnFamily_in_dropIndex2586);
            columnFamily190=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily190.getTree());
            char_literal191=(Token)match(input,116,FOLLOW_116_in_dropIndex2588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(char_literal191);

            pushFollow(FOLLOW_columnName_in_dropIndex2590);
            columnName192=columnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnName.add(columnName192.getTree());


            // AST REWRITE
            // elements: columnName, columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 352:9: -> ^( NODE_DROP_INDEX columnFamily columnName )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:352:12: ^( NODE_DROP_INDEX columnFamily columnName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_columnName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dropIndex"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:355:1: showVersion : SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW193=null;
        Token API_VERSION194=null;

        CommonTree SHOW193_tree=null;
        CommonTree API_VERSION194_tree=null;
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:356:5: ( SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:356:7: SHOW API_VERSION
            {
            SHOW193=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW193);

            API_VERSION194=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_showVersion2627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION194);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 357:9: -> ^( NODE_SHOW_VERSION )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:357:12: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showKeyspaces_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showKeyspaces"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:360:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW195=null;
        Token KEYSPACES196=null;

        CommonTree SHOW195_tree=null;
        CommonTree KEYSPACES196_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:361:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:361:7: SHOW KEYSPACES
            {
            SHOW195=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces2658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW195);

            KEYSPACES196=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces2660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES196);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 362:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:362:12: ^( NODE_SHOW_KEYSPACES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showKeyspaces"

    public static class showSchema_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showSchema"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:365:1: showSchema : SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) ;
    public final CliParser.showSchema_return showSchema() throws RecognitionException {
        CliParser.showSchema_return retval = new CliParser.showSchema_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW197=null;
        Token SCHEMA198=null;
        CliParser.keyspace_return keyspace199 = null;


        CommonTree SHOW197_tree=null;
        CommonTree SCHEMA198_tree=null;
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:366:5: ( SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:366:7: SHOW SCHEMA ( keyspace )?
            {
            SHOW197=(Token)match(input,SHOW,FOLLOW_SHOW_in_showSchema2692); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW197);

            SCHEMA198=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_showSchema2694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA198);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:366:19: ( keyspace )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=IntegerPositiveLiteral && LA21_0<=StringLiteral)||LA21_0==IntegerNegativeLiteral) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:366:20: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_showSchema2697);
                    keyspace199=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace199.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 367:9: -> ^( NODE_SHOW_SCHEMA ( keyspace )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:367:12: ^( NODE_SHOW_SCHEMA ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"), root_1);

                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:367:31: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showSchema"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:370:1: describeTable : DESCRIBE ( keyspace )? -> ^( NODE_DESCRIBE ( keyspace )? ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE200=null;
        CliParser.keyspace_return keyspace201 = null;


        CommonTree DESCRIBE200_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:371:5: ( DESCRIBE ( keyspace )? -> ^( NODE_DESCRIBE ( keyspace )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:371:7: DESCRIBE ( keyspace )?
            {
            DESCRIBE200=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable2735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE200);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:371:16: ( keyspace )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=IntegerPositiveLiteral && LA22_0<=StringLiteral)||LA22_0==IntegerNegativeLiteral) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:371:17: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_describeTable2738);
                    keyspace201=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace201.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 372:9: -> ^( NODE_DESCRIBE ( keyspace )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:372:12: ^( NODE_DESCRIBE ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE, "NODE_DESCRIBE"), root_1);

                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:372:28: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class describeCluster_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeCluster"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:375:1: describeCluster : DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) ;
    public final CliParser.describeCluster_return describeCluster() throws RecognitionException {
        CliParser.describeCluster_return retval = new CliParser.describeCluster_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE202=null;
        Token string_literal203=null;

        CommonTree DESCRIBE202_tree=null;
        CommonTree string_literal203_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:376:5: ( DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:376:7: DESCRIBE 'CLUSTER'
            {
            DESCRIBE202=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeCluster2780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE202);

            string_literal203=(Token)match(input,106,FOLLOW_106_in_describeCluster2782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal203);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:9: -> ^( NODE_DESCRIBE_CLUSTER )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:377:12: ^( NODE_DESCRIBE_CLUSTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeCluster"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:380:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE204=null;
        CliParser.keyspace_return keyspace205 = null;

        CliParser.username_return username206 = null;

        CliParser.password_return password207 = null;


        CommonTree USE204_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:7: USE keyspace ( username )? ( password )?
            {
            USE204=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace2813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE204);

            pushFollow(FOLLOW_keyspace_in_useKeyspace2815);
            keyspace205=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace205.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:20: ( username )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Identifier) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace2819);
                    username206=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username206.getTree());

                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:34: ( password )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==StringLiteral) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:381:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace2826);
                    password207=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password207.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: password, username, keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 382:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:382:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:382:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:382:52: ( password )?
                if ( stream_password.hasNext() ) {
                    adaptor.addChild(root_1, stream_password.nextTree());

                }
                stream_password.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "useKeyspace"

    public static class keyValuePairExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePairExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:386:1: keyValuePairExpr : entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND209=null;
        Token WITH210=null;
        CliParser.entityName_return entityName208 = null;

        CliParser.keyValuePair_return keyValuePair211 = null;


        CommonTree AND209_tree=null;
        CommonTree WITH210_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:5: ( entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:7: entityName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_entityName_in_keyValuePairExpr2878);
            entityName208=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName208.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:18: ( ( AND | WITH ) keyValuePair )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==WITH||LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:20: ( AND | WITH )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==AND) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==WITH) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:21: AND
            	            {
            	            AND209=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr2883); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND209);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:387:27: WITH
            	            {
            	            WITH210=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr2887); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH210);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr2890);
            	    keyValuePair211=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair211.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: keyValuePair, entityName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 388:9: -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:388:12: ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_entityName.nextTree());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:388:50: ( keyValuePair )*
                while ( stream_keyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValuePair.nextTree());

                }
                stream_keyValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePairExpr"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:391:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal213=null;
        CliParser.attr_name_return attr_name212 = null;

        CliParser.attrValue_return attrValue214 = null;


        CommonTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:392:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:392:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair2947);
            attr_name212=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name212.getTree());
            char_literal213=(Token)match(input,111,FOLLOW_111_in_keyValuePair2949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(char_literal213);

            pushFollow(FOLLOW_attrValue_in_keyValuePair2951);
            attrValue214=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue214.getTree());


            // AST REWRITE
            // elements: attr_name, attrValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 393:9: -> attr_name attrValue
            {
                adaptor.addChild(root_0, stream_attr_name.nextTree());
                adaptor.addChild(root_0, stream_attrValue.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class attrValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:396:1: attrValue : ( arrayConstruct | hashConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct215 = null;

        CliParser.hashConstruct_return hashConstruct216 = null;

        CliParser.attrValueString_return attrValueString217 = null;

        CliParser.attrValueInt_return attrValueInt218 = null;

        CliParser.attrValueDouble_return attrValueDouble219 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:397:5: ( arrayConstruct | hashConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt27=1;
                }
                break;
            case 120:
                {
                alt27=2;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt27=3;
                }
                break;
            case IntegerPositiveLiteral:
            case IntegerNegativeLiteral:
                {
                alt27=4;
                }
                break;
            case DoubleLiteral:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:397:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue2983);
                    arrayConstruct215=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct215.getTree());

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:398:7: hashConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hashConstruct_in_attrValue2991);
                    hashConstruct216=hashConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hashConstruct216.getTree());

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:399:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue2999);
                    attrValueString217=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString217.getTree());

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:400:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue3007);
                    attrValueInt218=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt218.getTree());

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:401:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue3015);
                    attrValueDouble219=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble219.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class arrayConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayConstruct"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:405:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )* ']' -> ^( ARRAY ( hashConstruct )* ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal220=null;
        Token char_literal222=null;
        Token char_literal223=null;
        CliParser.hashConstruct_return hashConstruct221 = null;


        CommonTree char_literal220_tree=null;
        CommonTree char_literal222_tree=null;
        CommonTree char_literal223_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:406:5: ( '[' ( hashConstruct ( ',' )? )* ']' -> ^( ARRAY ( hashConstruct )* ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:406:7: '[' ( hashConstruct ( ',' )? )* ']'
            {
            char_literal220=(Token)match(input,117,FOLLOW_117_in_arrayConstruct3034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal220);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:406:11: ( hashConstruct ( ',' )? )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==120) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:406:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct3037);
            	    hashConstruct221=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct221.getTree());
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:406:26: ( ',' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==118) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal222=(Token)match(input,118,FOLLOW_118_in_arrayConstruct3039); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_118.add(char_literal222);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            char_literal223=(Token)match(input,119,FOLLOW_119_in_arrayConstruct3044); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal223);



            // AST REWRITE
            // elements: hashConstruct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 407:9: -> ^( ARRAY ( hashConstruct )* )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:407:12: ^( ARRAY ( hashConstruct )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:407:20: ( hashConstruct )*
                while ( stream_hashConstruct.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashConstruct.nextTree());

                }
                stream_hashConstruct.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayConstruct"

    public static class hashConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashConstruct"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:410:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal224=null;
        Token char_literal226=null;
        Token char_literal228=null;
        CliParser.hashElementPair_return hashElementPair225 = null;

        CliParser.hashElementPair_return hashElementPair227 = null;


        CommonTree char_literal224_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:411:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:411:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal224=(Token)match(input,120,FOLLOW_120_in_hashConstruct3082); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(char_literal224);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct3084);
            hashElementPair225=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair225.getTree());
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:411:27: ( ',' hashElementPair )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==118) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:411:28: ',' hashElementPair
            	    {
            	    char_literal226=(Token)match(input,118,FOLLOW_118_in_hashConstruct3087); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal226);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct3089);
            	    hashElementPair227=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair227.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            char_literal228=(Token)match(input,121,FOLLOW_121_in_hashConstruct3093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_121.add(char_literal228);



            // AST REWRITE
            // elements: hashElementPair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 412:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:412:12: ^( HASH ( hashElementPair )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HASH, "HASH"), root_1);

                if ( !(stream_hashElementPair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashElementPair.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashElementPair.nextTree());

                }
                stream_hashElementPair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashConstruct"

    public static class hashElementPair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashElementPair"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:415:1: hashElementPair : rowKey ':' rowValue -> ^( PAIR rowKey rowValue ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal230=null;
        CliParser.rowKey_return rowKey229 = null;

        CliParser.rowValue_return rowValue231 = null;


        CommonTree char_literal230_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_rowValue=new RewriteRuleSubtreeStream(adaptor,"rule rowValue");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:416:5: ( rowKey ':' rowValue -> ^( PAIR rowKey rowValue ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:416:7: rowKey ':' rowValue
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair3129);
            rowKey229=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey229.getTree());
            char_literal230=(Token)match(input,122,FOLLOW_122_in_hashElementPair3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal230);

            pushFollow(FOLLOW_rowValue_in_hashElementPair3133);
            rowValue231=rowValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowValue.add(rowValue231.getTree());


            // AST REWRITE
            // elements: rowKey, rowValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:9: -> ^( PAIR rowKey rowValue )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:417:12: ^( PAIR rowKey rowValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_rowKey.nextTree());
                adaptor.addChild(root_1, stream_rowValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashElementPair"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:420:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal233=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal239=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily232 = null;

        CliParser.rowKey_return rowKey234 = null;


        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:421:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:421:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr3168);
            columnFamily232=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily232.getTree());
            char_literal233=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3170); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal233);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr3172);
            rowKey234=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey234.getTree());
            char_literal235=(Token)match(input,119,FOLLOW_119_in_columnFamilyExpr3174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal235);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:422:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==117) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:422:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal236=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(char_literal236);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3191);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal237=(Token)match(input,119,FOLLOW_119_in_columnFamilyExpr3193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal237);

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:423:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==117) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:423:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal238=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3209); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_117.add(char_literal238);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3213);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal239=(Token)match(input,119,FOLLOW_119_in_columnFamilyExpr3215); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(char_literal239);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: columnFamily, column, super_column, rowKey
            // token labels: 
            // rule labels: retval, column, super_column
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column",column!=null?column.tree:null);
            RewriteRuleSubtreeStream stream_super_column=new RewriteRuleSubtreeStream(adaptor,"rule super_column",super_column!=null?super_column.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 425:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:425:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:425:51: ( $column ( $super_column)? )?
                if ( stream_column.hasNext()||stream_super_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:425:60: ( $super_column)?
                    if ( stream_super_column.hasNext() ) {
                        adaptor.addChild(root_1, stream_super_column.nextTree());

                    }
                    stream_super_column.reset();

                }
                stream_column.reset();
                stream_super_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class keyRangeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyRangeExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:428:1: keyRangeExpr : '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal240=null;
        Token char_literal241=null;
        Token char_literal242=null;
        CliParser.entityName_return startKey = null;

        CliParser.entityName_return endKey = null;


        CommonTree char_literal240_tree=null;
        CommonTree char_literal241_tree=null;
        CommonTree char_literal242_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:5: ( '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:10: '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']'
            {
            char_literal240=(Token)match(input,117,FOLLOW_117_in_keyRangeExpr3278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal240);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:14: ( (startKey= entityName )? ':' (endKey= entityName )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=IntegerPositiveLiteral && LA35_0<=StringLiteral)||LA35_0==IntegerNegativeLiteral||LA35_0==122) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:16: (startKey= entityName )? ':' (endKey= entityName )?
                    {
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:24: (startKey= entityName )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=IntegerPositiveLiteral && LA33_0<=StringLiteral)||LA33_0==IntegerNegativeLiteral) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3284);
                            startKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(startKey.getTree());

                            }
                            break;

                    }

                    char_literal241=(Token)match(input,122,FOLLOW_122_in_keyRangeExpr3287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal241);

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:429:47: (endKey= entityName )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=IntegerPositiveLiteral && LA34_0<=StringLiteral)||LA34_0==IntegerNegativeLiteral) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3291);
                            endKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(endKey.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal242=(Token)match(input,119,FOLLOW_119_in_keyRangeExpr3297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal242);



            // AST REWRITE
            // elements: endKey, startKey
            // token labels: 
            // rule labels: endKey, retval, startKey
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey",endKey!=null?endKey.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey",startKey!=null?startKey.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 430:7: -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:430:10: ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:430:27: ( $startKey)?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:430:38: ( $endKey)?
                if ( stream_endKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_endKey.nextTree());

                }
                stream_endKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyRangeExpr"

    public static class rowLimitExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowLimitExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:433:1: rowLimitExpr : 'LIMIT' limit= IntegerPositiveLiteral -> ^( NODE_LIMIT $limit) ;
    public final CliParser.rowLimitExpr_return rowLimitExpr() throws RecognitionException {
        CliParser.rowLimitExpr_return retval = new CliParser.rowLimitExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token string_literal243=null;

        CommonTree limit_tree=null;
        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:434:5: ( 'LIMIT' limit= IntegerPositiveLiteral -> ^( NODE_LIMIT $limit) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:434:7: 'LIMIT' limit= IntegerPositiveLiteral
            {
            string_literal243=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_rowLimitExpr3334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal243);

            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowLimitExpr3338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);



            // AST REWRITE
            // elements: limit
            // token labels: limit
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 435:9: -> ^( NODE_LIMIT $limit)
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:435:12: ^( NODE_LIMIT $limit)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_1);

                adaptor.addChild(root_1, stream_limit.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowLimitExpr"

    public static class columnLimitExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnLimitExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:438:1: columnLimitExpr : 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )? -> ^( NODE_COLUMNS $columns ( reversedExpr )? ) ;
    public final CliParser.columnLimitExpr_return columnLimitExpr() throws RecognitionException {
        CliParser.columnLimitExpr_return retval = new CliParser.columnLimitExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token columns=null;
        Token string_literal244=null;
        CliParser.reversedExpr_return reversedExpr245 = null;


        CommonTree columns_tree=null;
        CommonTree string_literal244_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_reversedExpr=new RewriteRuleSubtreeStream(adaptor,"rule reversedExpr");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:439:5: ( 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )? -> ^( NODE_COLUMNS $columns ( reversedExpr )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:439:7: 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )?
            {
            string_literal244=(Token)match(input,123,FOLLOW_123_in_columnLimitExpr3372); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(string_literal244);

            columns=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_columnLimitExpr3376); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(columns);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:439:48: ( reversedExpr )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==124) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: reversedExpr
                    {
                    pushFollow(FOLLOW_reversedExpr_in_columnLimitExpr3378);
                    reversedExpr245=reversedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_reversedExpr.add(reversedExpr245.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: columns, reversedExpr
            // token labels: columns
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_columns=new RewriteRuleTokenStream(adaptor,"token columns",columns);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 440:9: -> ^( NODE_COLUMNS $columns ( reversedExpr )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:440:12: ^( NODE_COLUMNS $columns ( reversedExpr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMNS, "NODE_COLUMNS"), root_1);

                adaptor.addChild(root_1, stream_columns.nextNode());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:440:36: ( reversedExpr )?
                if ( stream_reversedExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_reversedExpr.nextTree());

                }
                stream_reversedExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnLimitExpr"

    public static class reversedExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reversedExpr"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:443:1: reversedExpr : 'REVERSED' -> ^( NODE_REVERSED ) ;
    public final CliParser.reversedExpr_return reversedExpr() throws RecognitionException {
        CliParser.reversedExpr_return retval = new CliParser.reversedExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal246=null;

        CommonTree string_literal246_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:444:5: ( 'REVERSED' -> ^( NODE_REVERSED ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:444:7: 'REVERSED'
            {
            string_literal246=(Token)match(input,124,FOLLOW_124_in_reversedExpr3416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(string_literal246);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 445:9: -> ^( NODE_REVERSED )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:445:12: ^( NODE_REVERSED )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_REVERSED, "NODE_REVERSED"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reversedExpr"

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:448:1: columnName : entityName ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName247 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:449:2: ( entityName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:449:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnName3444);
            entityName247=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName247.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnName"

    public static class attr_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_name"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:452:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier248=null;

        CommonTree Identifier248_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:453:5: ( Identifier )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:453:7: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier248=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name3458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier248_tree = (CommonTree)adaptor.create(Identifier248);
            adaptor.addChild(root_0, Identifier248_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_name"

    public static class attrValueString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueString"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:456:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set249=null;

        CommonTree set249_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:457:5: ( ( Identifier | StringLiteral ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:457:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set249=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set249));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueString"

    public static class attrValueInt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueInt"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:460:1: attrValueInt : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set250=null;

        CommonTree set250_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:461:5: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set250=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set250));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueInt"

    public static class attrValueDouble_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueDouble"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:465:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral251=null;

        CommonTree DoubleLiteral251_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:466:5: ( DoubleLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:466:7: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral251=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble3527); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral251_tree = (CommonTree)adaptor.create(DoubleLiteral251);
            adaptor.addChild(root_0, DoubleLiteral251_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueDouble"

    public static class keyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspace"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:469:1: keyspace : entityName ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName252 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:470:2: ( entityName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:470:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspace3543);
            entityName252=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName252.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspace"

    public static class replica_placement_strategy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replica_placement_strategy"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:473:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral253=null;

        CommonTree StringLiteral253_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:474:5: ( StringLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:474:7: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral253=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy3557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral253_tree = (CommonTree)adaptor.create(StringLiteral253);
            adaptor.addChild(root_0, StringLiteral253_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replica_placement_strategy"

    public static class keyspaceNewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspaceNewName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:477:1: keyspaceNewName : entityName ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName254 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:478:2: ( entityName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:478:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspaceNewName3571);
            entityName254=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName254.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspaceNewName"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:481:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral255=null;

        CommonTree StringLiteral255_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:482:5: ( StringLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:482:7: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral255=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator3585); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral255_tree = (CommonTree)adaptor.create(StringLiteral255);
            adaptor.addChild(root_0, StringLiteral255_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:485:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier256=null;

        CommonTree Identifier256_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:485:9: ( Identifier )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:485:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier256=(Token)match(input,Identifier,FOLLOW_Identifier_in_command3604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier256_tree = (CommonTree)adaptor.create(Identifier256);
            adaptor.addChild(root_0, Identifier256_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class newColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newColumnFamily"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:488:1: newColumnFamily : entityName ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName257 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:489:2: ( entityName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:489:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_newColumnFamily3618);
            entityName257=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName257.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newColumnFamily"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:492:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier258=null;

        CommonTree Identifier258_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:492:9: ( Identifier )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:492:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier258=(Token)match(input,Identifier,FOLLOW_Identifier_in_username3627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier258_tree = (CommonTree)adaptor.create(Identifier258);
            adaptor.addChild(root_0, Identifier258_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:495:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral259=null;

        CommonTree StringLiteral259_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:495:9: ( StringLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:495:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral259=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password3639); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral259_tree = (CommonTree)adaptor.create(StringLiteral259);
            adaptor.addChild(root_0, StringLiteral259_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:498:1: columnFamily : entityName ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName260 = null;



        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:499:3: ( entityName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:499:5: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnFamily3654);
            entityName260=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName260.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class entityName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:502:1: entityName : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) ;
    public final CliParser.entityName_return entityName() throws RecognitionException {
        CliParser.entityName_return retval = new CliParser.entityName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set261=null;

        CommonTree set261_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:503:3: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:503:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set261=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set261));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityName"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:506:1: rowKey : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier262=null;
        Token StringLiteral263=null;
        Token IntegerPositiveLiteral264=null;
        Token IntegerNegativeLiteral265=null;
        CliParser.functionCall_return functionCall266 = null;


        CommonTree Identifier262_tree=null;
        CommonTree StringLiteral263_tree=null;
        CommonTree IntegerPositiveLiteral264_tree=null;
        CommonTree IntegerNegativeLiteral265_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:5: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            int alt37=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==125) ) {
                    alt37=5;
                }
                else if ( (LA37_1==119||LA37_1==122) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt37=2;
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt37=3;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:9: Identifier
                    {
                    Identifier262=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey3699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier262_tree = (CommonTree)adaptor.create(Identifier262);
                    adaptor.addChild(root_0, Identifier262_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:22: StringLiteral
                    {
                    StringLiteral263=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey3703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral263_tree = (CommonTree)adaptor.create(StringLiteral263);
                    adaptor.addChild(root_0, StringLiteral263_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:38: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral264=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowKey3707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral264_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral264);
                    adaptor.addChild(root_0, IntegerPositiveLiteral264_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:63: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral265=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_rowKey3711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral265_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral265);
                    adaptor.addChild(root_0, IntegerNegativeLiteral265_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:507:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey3715);
                    functionCall266=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall266.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class rowValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowValue"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:510:1: rowValue : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct ) ;
    public final CliParser.rowValue_return rowValue() throws RecognitionException {
        CliParser.rowValue_return retval = new CliParser.rowValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier267=null;
        Token StringLiteral268=null;
        Token IntegerPositiveLiteral269=null;
        Token IntegerNegativeLiteral270=null;
        CliParser.functionCall_return functionCall271 = null;

        CliParser.hashConstruct_return hashConstruct272 = null;


        CommonTree Identifier267_tree=null;
        CommonTree StringLiteral268_tree=null;
        CommonTree IntegerPositiveLiteral269_tree=null;
        CommonTree IntegerNegativeLiteral270_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:5: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct )
            int alt38=6;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==125) ) {
                    alt38=5;
                }
                else if ( (LA38_1==EOF||LA38_1==118||LA38_1==121) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt38=2;
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt38=3;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt38=4;
                }
                break;
            case 120:
                {
                alt38=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:9: Identifier
                    {
                    Identifier267=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowValue3737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier267_tree = (CommonTree)adaptor.create(Identifier267);
                    adaptor.addChild(root_0, Identifier267_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:22: StringLiteral
                    {
                    StringLiteral268=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowValue3741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral268_tree = (CommonTree)adaptor.create(StringLiteral268);
                    adaptor.addChild(root_0, StringLiteral268_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:38: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral269=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowValue3745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral269_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral269);
                    adaptor.addChild(root_0, IntegerPositiveLiteral269_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:63: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral270=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_rowValue3749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral270_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral270);
                    adaptor.addChild(root_0, IntegerNegativeLiteral270_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowValue3753);
                    functionCall271=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall271.getTree());

                    }
                    break;
                case 6 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:511:103: hashConstruct
                    {
                    pushFollow(FOLLOW_hashConstruct_in_rowValue3757);
                    hashConstruct272=hashConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hashConstruct272.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowValue"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:514:1: value : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier273=null;
        Token IntegerPositiveLiteral274=null;
        Token IntegerNegativeLiteral275=null;
        Token StringLiteral276=null;
        CliParser.functionCall_return functionCall277 = null;


        CommonTree Identifier273_tree=null;
        CommonTree IntegerPositiveLiteral274_tree=null;
        CommonTree IntegerNegativeLiteral275_tree=null;
        CommonTree StringLiteral276_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:5: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt39=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==125) ) {
                    alt39=5;
                }
                else if ( (LA39_1==EOF||LA39_1==SEMICOLON||LA39_1==WITH||LA39_1==AND||LA39_1==LIMIT) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt39=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt39=3;
                }
                break;
            case StringLiteral:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:8: Identifier
                    {
                    Identifier273=(Token)match(input,Identifier,FOLLOW_Identifier_in_value3779); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier273_tree = (CommonTree)adaptor.create(Identifier273);
                    adaptor.addChild(root_0, Identifier273_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:21: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral274=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_value3783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral274_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral274);
                    adaptor.addChild(root_0, IntegerPositiveLiteral274_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:46: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral275=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_value3787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral275_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral275);
                    adaptor.addChild(root_0, IntegerNegativeLiteral275_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:71: StringLiteral
                    {
                    StringLiteral276=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value3791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral276_tree = (CommonTree)adaptor.create(StringLiteral276);
                    adaptor.addChild(root_0, StringLiteral276_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:515:87: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value3795);
                    functionCall277=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall277.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:518:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal278=null;
        Token char_literal280=null;
        CliParser.functionArgument_return functionArgument279 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal278_tree=null;
        CommonTree char_literal280_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:519:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:519:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall3816); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal278=(Token)match(input,125,FOLLOW_125_in_functionCall3818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_125.add(char_literal278);

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:519:35: ( functionArgument )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=IntegerPositiveLiteral && LA40_0<=StringLiteral)||LA40_0==IntegerNegativeLiteral) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3820);
                    functionArgument279=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument279.getTree());

                    }
                    break;

            }

            char_literal280=(Token)match(input,126,FOLLOW_126_in_functionCall3823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal280);



            // AST REWRITE
            // elements: functionName, functionArgument
            // token labels: functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 520:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:520:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:520:42: ( functionArgument )?
                if ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:523:1: functionArgument : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set281=null;

        CommonTree set281_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:524:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set281=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set281));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:527:1: columnOrSuperColumn : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier282=null;
        Token IntegerPositiveLiteral283=null;
        Token IntegerNegativeLiteral284=null;
        Token StringLiteral285=null;
        CliParser.functionCall_return functionCall286 = null;


        CommonTree Identifier282_tree=null;
        CommonTree IntegerPositiveLiteral283_tree=null;
        CommonTree IntegerNegativeLiteral284_tree=null;
        CommonTree StringLiteral285_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:5: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt41=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==125) ) {
                    alt41=5;
                }
                else if ( ((LA41_1>=111 && LA41_1<=115)||LA41_1==119) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt41=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt41=3;
                }
                break;
            case StringLiteral:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:8: Identifier
                    {
                    Identifier282=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn3891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier282_tree = (CommonTree)adaptor.create(Identifier282);
                    adaptor.addChild(root_0, Identifier282_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:21: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral283=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn3895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral283_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral283);
                    adaptor.addChild(root_0, IntegerPositiveLiteral283_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:46: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral284=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn3899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral284_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral284);
                    adaptor.addChild(root_0, IntegerNegativeLiteral284_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:71: StringLiteral
                    {
                    StringLiteral285=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn3903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral285_tree = (CommonTree)adaptor.create(StringLiteral285);
                    adaptor.addChild(root_0, StringLiteral285_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:528:87: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn3907);
                    functionCall286=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall286.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:531:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name287 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:532:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:532:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host3929);
            host_name287=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name287.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 533:9: -> ^( NODE_ID_LIST host_name )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:533:12: ^( NODE_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:536:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier288=null;
        Token char_literal289=null;
        Token Identifier290=null;

        CommonTree Identifier288_tree=null;
        CommonTree char_literal289_tree=null;
        CommonTree Identifier290_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:537:5: ( Identifier ( '.' Identifier )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:537:7: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier288=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier288_tree = (CommonTree)adaptor.create(Identifier288);
            adaptor.addChild(root_0, Identifier288_tree);
            }
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:537:18: ( '.' Identifier )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==116) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:537:19: '.' Identifier
            	    {
            	    char_literal289=(Token)match(input,116,FOLLOW_116_in_host_name3965); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal289_tree = (CommonTree)adaptor.create(char_literal289);
            	    adaptor.addChild(root_0, char_literal289_tree);
            	    }
            	    Identifier290=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3967); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier290_tree = (CommonTree)adaptor.create(Identifier290);
            	    adaptor.addChild(root_0, Identifier290_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:540:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS291=null;

        CommonTree IP_ADDRESS291_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:541:5: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:541:7: IP_ADDRESS
            {
            IP_ADDRESS291=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address3990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS291);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 542:9: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:542:12: ^( NODE_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:546:1: port : IntegerPositiveLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerPositiveLiteral292=null;

        CommonTree IntegerPositiveLiteral292_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:547:5: ( IntegerPositiveLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:547:7: IntegerPositiveLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerPositiveLiteral292=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_port4029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerPositiveLiteral292_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral292);
            adaptor.addChild(root_0, IntegerPositiveLiteral292_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    public static class incrementValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrementValue"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:550:1: incrementValue : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.incrementValue_return incrementValue() throws RecognitionException {
        CliParser.incrementValue_return retval = new CliParser.incrementValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set293=null;

        CommonTree set293_tree=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:551:5: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set293=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set293));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrementValue"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\1\23\3\uffff\1\25\30\uffff";
    static final String DFA2_minS =
        "\1\60\3\uffff\1\60\3\74\25\uffff";
    static final String DFA2_maxS =
        "\1\154\3\uffff\1\152\2\76\1\101\25\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\30\1\5\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\27";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\23\1\1\1\13\1\10\1\4\2\2\1\16\3\uffff\1\5\1\uffff\1\6\2\uffff"+
            "\1\7\1\uffff\1\12\1\14\2\15\1\11\1\3\1\17\1\20\1\21\1\22\40"+
            "\uffff\1\13",
            "",
            "",
            "",
            "\1\25\33\uffff\3\25\5\uffff\1\25\25\uffff\1\24",
            "\1\26\1\uffff\1\27",
            "\1\30\1\uffff\1\31",
            "\1\33\1\uffff\1\32\2\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "144:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA6_eotS =
        "\45\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\27\4\uffff\1\31\36\uffff";
    static final String DFA6_minS =
        "\1\62\1\60\4\uffff\1\60\2\uffff\1\70\3\74\30\uffff";
    static final String DFA6_maxS =
        "\1\154\1\113\4\uffff\1\152\2\uffff\1\153\2\76\1\101\30\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\36\1\1\1\2\1\3\1\uffff\1\6\1\7\4\uffff\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\5\1\4\1\10\1\11\1\12"+
        "\1\13\1\14\1\16\1\15\1\17\1\20\1\21\1\22";
    static final String DFA6_specialS =
        "\45\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\71\uffff\1\2",
            "\1\27\1\4\1\3\1\5\1\6\1\7\1\10\1\11\3\uffff\1\12\1\uffff\1"+
            "\13\2\uffff\1\14\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\26",
            "",
            "",
            "",
            "",
            "\1\31\71\uffff\1\30",
            "",
            "",
            "\1\33\1\34\1\35\60\uffff\1\32",
            "\1\36\1\uffff\1\37",
            "\1\40\1\uffff\1\41",
            "\1\42\1\uffff\1\43\2\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "178:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root435 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeCluster_in_statement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrStatement_in_statement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consistencyLevelStatement_in_statement624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndex_in_statement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_host_in_connectStatement663 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_connectStatement665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_port_in_connectStatement667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_username_in_connectStatement670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_password_in_connectStatement672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement709 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_connectStatement711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_port_in_connectStatement713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_username_in_connectStatement716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_password_in_connectStatement718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement762 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement789 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement816 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement843 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement869 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement871 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_helpStatement873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement897 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement924 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement951 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement953 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_helpStatement955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement979 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement981 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1008 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1010 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_helpStatement1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1040 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1042 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_helpStatement1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1068 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1070 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1097 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1099 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1125 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1127 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1129 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1156 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1158 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1160 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1188 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1217 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1219 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_helpStatement1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_GET_in_helpStatement1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_helpStatement1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INCR_in_helpStatement1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DECR_in_helpStatement1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_helpStatement1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_helpStatement1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1636 = new BitSet(new long[]{0x0000000000000002L,0x0000200002000000L});
    public static final BitSet FOLLOW_109_in_getStatement1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1641 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1697 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_getStatement1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1701 = new BitSet(new long[]{0x0000000000000002L,0x0000000002080000L});
    public static final BitSet FOLLOW_AND_in_getStatement1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1706 = new BitSet(new long[]{0x0000000000000002L,0x0000000002080000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1766 = new BitSet(new long[]{0x0000000000000000L,0x000F800000000000L});
    public static final BitSet FOLLOW_operator_in_getCondition1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_value_in_getCondition1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement1868 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_setStatement1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_value_in_setStatement1874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_WITH_in_setStatement1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_TTL_in_setStatement1879 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_setStatement1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_setStatement1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_incrStatement1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement1933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_BY_in_incrStatement1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_incrStatement1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement1976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_BY_in_incrStatement1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showSchema_in_showStatement2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement2139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement2141 = new BitSet(new long[]{0x0000000000000002L,0x0820000002000000L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement2143 = new BitSet(new long[]{0x0000000000000002L,0x0800000002000000L});
    public static final BitSet FOLLOW_rowLimitExpr_in_listStatement2146 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_columnLimitExpr_in_listStatement2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement2192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement2233 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_assumeStatement2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_entityName_in_assumeStatement2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2275 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_consistencyLevelStatement2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_consistencyLevelStatement2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName2315 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_showClusterName2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace2348 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily2386 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily2388 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2426 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2463 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2465 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2502 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2540 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2542 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropIndex2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_dropIndex2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ON_in_dropIndex2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnFamily_in_dropIndex2586 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_dropIndex2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnName_in_dropIndex2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2625 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_showVersion2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces2658 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showSchema2692 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_showSchema2694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyspace_in_showSchema2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable2735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyspace_in_describeTable2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeCluster2780 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_describeCluster2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace2815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_username_in_useKeyspace2819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_password_in_useKeyspace2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyValuePairExpr2878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000088000L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr2883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr2890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000088000L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair2947 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_keyValuePair2949 = new BitSet(new long[]{0x0000000000000000L,0x0120000000307000L});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashConstruct_in_attrValue2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_arrayConstruct3034 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct3037 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_118_in_arrayConstruct3039 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_119_in_arrayConstruct3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_hashConstruct3082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3084 = new BitSet(new long[]{0x0000000000000000L,0x0240000000000000L});
    public static final BitSet FOLLOW_118_in_hashConstruct3087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3089 = new BitSet(new long[]{0x0000000000000000L,0x0240000000000000L});
    public static final BitSet FOLLOW_121_in_hashConstruct3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair3129 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_hashElementPair3131 = new BitSet(new long[]{0x0000000000000000L,0x0100000000107000L});
    public static final BitSet FOLLOW_rowValue_in_hashElementPair3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr3168 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr3172 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_columnFamilyExpr3174 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3191 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_columnFamilyExpr3193 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000107000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3213 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_columnFamilyExpr3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_keyRangeExpr3278 = new BitSet(new long[]{0x0000000000000000L,0x0480000000107000L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3284 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_keyRangeExpr3287 = new BitSet(new long[]{0x0000000000000000L,0x0080000000107000L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3291 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_keyRangeExpr3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_rowLimitExpr3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowLimitExpr3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_columnLimitExpr3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_columnLimitExpr3376 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_reversedExpr_in_columnLimitExpr3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_reversedExpr3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnName3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueInt0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspace3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspaceNewName3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_newColumnFamily3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnFamily3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_entityName3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowKey3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_rowKey3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowValue3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowValue3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowValue3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_rowValue3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowValue3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashConstruct_in_rowValue3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_value3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_value3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall3816 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_functionCall3818 = new BitSet(new long[]{0x0000000000000000L,0x4000000000107000L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3820 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_functionCall3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3962 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_host_name3965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_host_name3967 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_port4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrementValue0 = new BitSet(new long[]{0x0000000000000002L});

}