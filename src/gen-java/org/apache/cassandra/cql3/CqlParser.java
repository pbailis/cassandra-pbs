// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g 2012-06-05 19:50:25

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;

    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.utils.Pair;
    import org.apache.cassandra.thrift.ConsistencyLevel;
    import org.apache.cassandra.thrift.InvalidRequestException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_COUNT", "K_FROM", "K_USING", "K_CONSISTENCY", "K_LEVEL", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "INTEGER", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_TIMESTAMP", "K_TTL", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_INDEX", "IDENT", "K_ON", "K_ALTER", "K_TYPE", "K_ADD", "K_DROP", "K_TRUNCATE", "QUOTED_NAME", "K_TOKEN", "STRING_LITERAL", "UUID", "FLOAT", "QMARK", "COMPIDENT", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_COUNTER", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "S", "E", "L", "C", "T", "F", "R", "O", "M", "W", "H", "A", "N", "D", "K", "Y", "I", "U", "P", "G", "Q", "B", "X", "V", "J", "Z", "DIGIT", "LETTER", "HEX", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'='", "'.'", "'+'", "'-'", "'<'", "'<='", "'>='", "'>'"
    };
    public static final int LETTER=96;
    public static final int K_INT=63;
    public static final int K_CREATE=30;
    public static final int K_CLUSTERING=38;
    public static final int EOF=-1;
    public static final int K_PRIMARY=34;
    public static final int K_VALUES=21;
    public static final int K_USE=4;
    public static final int STRING_LITERAL=49;
    public static final int K_ON=41;
    public static final int K_USING=8;
    public static final int K_ADD=44;
    public static final int K_ASC=17;
    public static final int K_KEY=35;
    public static final int COMMENT=99;
    public static final int K_TRUNCATE=46;
    public static final int K_ORDER=12;
    public static final int D=82;
    public static final int E=70;
    public static final int F=74;
    public static final int G=88;
    public static final int K_COUNT=6;
    public static final int K_KEYSPACE=31;
    public static final int K_TYPE=43;
    public static final int A=80;
    public static final int B=90;
    public static final int C=72;
    public static final int L=71;
    public static final int M=77;
    public static final int N=81;
    public static final int O=76;
    public static final int H=79;
    public static final int I=85;
    public static final int J=93;
    public static final int K_UPDATE=24;
    public static final int K=83;
    public static final int U=86;
    public static final int T=73;
    public static final int K_TEXT=64;
    public static final int W=78;
    public static final int V=92;
    public static final int Q=89;
    public static final int P=87;
    public static final int K_COMPACT=36;
    public static final int S=69;
    public static final int R=75;
    public static final int K_TTL=23;
    public static final int Y=84;
    public static final int X=91;
    public static final int Z=94;
    public static final int K_INDEX=39;
    public static final int K_INSERT=19;
    public static final int WS=98;
    public static final int K_APPLY=29;
    public static final int K_STORAGE=37;
    public static final int K_TIMESTAMP=22;
    public static final int K_AND=16;
    public static final int K_DESC=18;
    public static final int K_TOKEN=48;
    public static final int QMARK=52;
    public static final int K_LEVEL=10;
    public static final int K_BATCH=28;
    public static final int K_UUID=65;
    public static final int K_ASCII=55;
    public static final int UUID=50;
    public static final int K_DELETE=26;
    public static final int K_BY=13;
    public static final int FLOAT=51;
    public static final int K_FLOAT=62;
    public static final int K_VARINT=67;
    public static final int K_DOUBLE=61;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=14;
    public static final int K_ALTER=42;
    public static final int K_BOOLEAN=58;
    public static final int K_SET=25;
    public static final int K_WHERE=11;
    public static final int QUOTED_NAME=47;
    public static final int MULTILINE_COMMENT=100;
    public static final int K_BLOB=57;
    public static final int T__107=107;
    public static final int HEX=97;
    public static final int K_INTO=20;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int K_VARCHAR=66;
    public static final int T__113=113;
    public static final int IDENT=40;
    public static final int T__112=112;
    public static final int DIGIT=95;
    public static final int K_BEGIN=27;
    public static final int INTEGER=15;
    public static final int K_COUNTER=59;
    public static final int K_DECIMAL=60;
    public static final int K_CONSISTENCY=9;
    public static final int K_WITH=32;
    public static final int COMPIDENT=53;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int K_IN=54;
    public static final int K_FROM=7;
    public static final int K_COLUMNFAMILY=33;
    public static final int K_DROP=45;
    public static final int K_BIGINT=56;
    public static final int K_TIMEUUID=68;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private List<String> recognitionErrors = new ArrayList<String>();
        private int currentBindMarkerIdx = -1;

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws InvalidRequestException
        {
            if (recognitionErrors.size() > 0)
                throw new InvalidRequestException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        // used by UPDATE of the counter columns to validate if '-' was supplied by user
        public void validateMinusSupplied(Object op, final Term value, IntStream stream) throws MissingTokenException
        {
            if (op == null && (value.isBindMarker() || Long.parseLong(value.getText()) > 0))
                throw new MissingTokenException(102, stream, value);
        }




    // $ANTLR start "query"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:122:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:125:5: (st= cqlStatement ( ';' )* EOF )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:125:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:125:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==101) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:125:24: ';'
            	    {
            	    match(input,101,FOLLOW_101_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:128:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement st2 = null;

        UpdateStatement st3 = null;

        BatchStatement st4 = null;

        DeleteStatement st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateColumnFamilyStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropColumnFamilyStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:130:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement )
            int alt2=14;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:130:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:131:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:132:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:133:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:134:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:135:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:136:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:137:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:138:7: st9= createColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_createColumnFamilyStatement_in_cqlStatement307);
                    st9=createColumnFamilyStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:139:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement319);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:140:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement338);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:141:7: st12= dropColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_dropColumnFamilyStatement_in_cqlStatement356);
                    st12=dropColumnFamilyStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:142:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement370);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:143:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement391);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundTerms(currentBindMarkerIdx + 1); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:149:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:150:5: ( K_USE ks= keyspaceName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:150:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement424); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement428);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:153:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        Token rows=null;
        Token K_LEVEL1=null;
        List<ColumnIdentifier> sclause = null;

        CFName cf = null;

        List<Relation> wclause = null;



                boolean isCount = false;
                ConsistencyLevel cLevel = ConsistencyLevel.ONE;
                int limit = 10000;
                Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:5: ( K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:7: K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement462); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:16: (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=K_CONSISTENCY && LA3_0<=K_LEVEL)||(LA3_0>=K_VALUES && LA3_0<=K_TTL)||(LA3_0>=K_KEY && LA3_0<=K_CLUSTERING)||LA3_0==IDENT||LA3_0==K_TYPE||LA3_0==QUOTED_NAME||(LA3_0>=K_ASCII && LA3_0<=K_TIMEUUID)||LA3_0==105) ) {
                alt3=1;
            }
            else if ( (LA3_0==K_COUNT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==102) ) {
                    alt3=2;
                }
                else if ( (LA3_2==K_FROM||LA3_2==104) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:18: sclause= selectClause
                    {
                    pushFollow(FOLLOW_selectClause_in_selectStatement468);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    {
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:167:42: K_COUNT '(' sclause= selectCountClause ')'
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement473); 
                    match(input,102,FOLLOW_102_in_selectStatement475); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement479);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,103,FOLLOW_103_in_selectStatement481); 
                     isCount = true; 

                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement494); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement498);
            cf=columnFamilyName();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:169:7: ( K_USING K_CONSISTENCY K_LEVEL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_USING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:169:9: K_USING K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_selectStatement508); 
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_selectStatement510); 
                    K_LEVEL1=(Token)match(input,K_LEVEL,FOLLOW_K_LEVEL_in_selectStatement512); 
                     cLevel = ConsistencyLevel.valueOf((K_LEVEL1!=null?K_LEVEL1.getText():null).toUpperCase()); 

                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:170:7: ( K_WHERE wclause= whereClause )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:170:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement527); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement531);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:171:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==K_ORDER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:171:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement544); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement546); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement548);
                    orderByClause(orderings);

                    state._fsp--;

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:171:47: ( ',' orderByClause[orderings] )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==104) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:171:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,104,FOLLOW_104_in_selectStatement553); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement555);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:172:7: ( K_LIMIT rows= INTEGER )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_LIMIT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:172:9: K_LIMIT rows= INTEGER
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement572); 
                    rows=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectStatement576); 
                     limit = Integer.parseInt((rows!=null?rows.getText():null)); 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(cLevel,
                                                                                         limit,
                                                                                         orderings,
                                                                                         isCount);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:182:1: selectClause returns [List<ColumnIdentifier> expr] : (ids= cidentList | '\\*' );
    public final List<ColumnIdentifier> selectClause() throws RecognitionException {
        List<ColumnIdentifier> expr = null;

        List<ColumnIdentifier> ids = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:183:5: (ids= cidentList | '\\*' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==K_COUNT||(LA9_0>=K_CONSISTENCY && LA9_0<=K_LEVEL)||(LA9_0>=K_VALUES && LA9_0<=K_TTL)||(LA9_0>=K_KEY && LA9_0<=K_CLUSTERING)||LA9_0==IDENT||LA9_0==K_TYPE||LA9_0==QUOTED_NAME||(LA9_0>=K_ASCII && LA9_0<=K_TIMEUUID)) ) {
                alt9=1;
            }
            else if ( (LA9_0==105) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:183:7: ids= cidentList
                    {
                    pushFollow(FOLLOW_cidentList_in_selectClause612);
                    ids=cidentList();

                    state._fsp--;

                     expr = ids; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:184:7: '\\*'
                    {
                    match(input,105,FOLLOW_105_in_selectClause622); 
                     expr = Collections.<ColumnIdentifier>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selectCountClause"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:187:1: selectCountClause returns [List<ColumnIdentifier> expr] : (c= selectClause | i= INTEGER );
    public final List<ColumnIdentifier> selectCountClause() throws RecognitionException {
        List<ColumnIdentifier> expr = null;

        Token i=null;
        List<ColumnIdentifier> c = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:188:5: (c= selectClause | i= INTEGER )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_COUNT||(LA10_0>=K_CONSISTENCY && LA10_0<=K_LEVEL)||(LA10_0>=K_VALUES && LA10_0<=K_TTL)||(LA10_0>=K_KEY && LA10_0<=K_CLUSTERING)||LA10_0==IDENT||LA10_0==K_TYPE||LA10_0==QUOTED_NAME||(LA10_0>=K_ASCII && LA10_0<=K_TIMEUUID)||LA10_0==105) ) {
                alt10=1;
            }
            else if ( (LA10_0==INTEGER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:188:7: c= selectClause
                    {
                    pushFollow(FOLLOW_selectClause_in_selectCountClause657);
                    c=selectClause();

                    state._fsp--;

                     expr = c; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:189:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause669); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<ColumnIdentifier>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:192:1: whereClause returns [List<Relation> clause] : first= relation ( K_AND next= relation )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

        Relation first = null;

        Relation next = null;


         clause = new ArrayList<Relation>(); 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:194:5: (first= relation ( K_AND next= relation )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:194:7: first= relation ( K_AND next= relation )*
            {
            pushFollow(FOLLOW_relation_in_whereClause707);
            first=relation();

            state._fsp--;

             clause.add(first); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:194:46: ( K_AND next= relation )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==K_AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:194:47: K_AND next= relation
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause712); 
            	    pushFollow(FOLLOW_relation_in_whereClause716);
            	    next=relation();

            	    state._fsp--;

            	     clause.add(next); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:197:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier c = null;



                ColumnIdentifier orderBy = null;
                boolean reversed = false;
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:202:5: (c= cident ( K_ASC | K_DESC )? )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:202:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause748);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:202:33: ( K_ASC | K_DESC )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==K_ASC) ) {
                alt12=1;
            }
            else if ( (LA12_0==K_DESC) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:202:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause753); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:202:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause757); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:205:1: insertStatement returns [UpdateStatement expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )+ ')' K_VALUES '(' v1= term ( ',' vn= term )+ ')' ( usingClause[attrs] )? ;
    public final UpdateStatement insertStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        ColumnIdentifier c1 = null;

        ColumnIdentifier cn = null;

        Term v1 = null;

        Term vn = null;



                Attributes attrs = new Attributes();
                List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
                List<Term> columnValues = new ArrayList<Term>();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:218:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )+ ')' K_VALUES '(' v1= term ( ',' vn= term )+ ')' ( usingClause[attrs] )? )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:218:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )+ ')' K_VALUES '(' v1= term ( ',' vn= term )+ ')' ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement795); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement797); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement801);
            cf=columnFamilyName();

            state._fsp--;

            match(input,102,FOLLOW_102_in_insertStatement813); 
            pushFollow(FOLLOW_cident_in_insertStatement817);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:219:51: ( ',' cn= cident )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==104) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:219:53: ',' cn= cident
            	    {
            	    match(input,104,FOLLOW_104_in_insertStatement824); 
            	    pushFollow(FOLLOW_cident_in_insertStatement828);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,103,FOLLOW_103_in_insertStatement835); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement845); 
            match(input,102,FOLLOW_102_in_insertStatement857); 
            pushFollow(FOLLOW_term_in_insertStatement861);
            v1=term();

            state._fsp--;

             columnValues.add(v1); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:221:49: ( ',' vn= term )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==104) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:221:51: ',' vn= term
            	    {
            	    match(input,104,FOLLOW_104_in_insertStatement867); 
            	    pushFollow(FOLLOW_term_in_insertStatement871);
            	    vn=term();

            	    state._fsp--;

            	     columnValues.add(vn); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match(input,103,FOLLOW_103_in_insertStatement878); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:222:9: ( usingClause[attrs] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==K_USING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:222:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement890);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement(cf, columnNames, columnValues, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:228:1: usingClause[Attributes attrs] : K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes attrs) throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:5: ( K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:7: K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause920); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause922);
            usingClauseObjective(attrs);

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:43: ( ( K_AND )? usingClauseObjective[attrs] )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==K_CONSISTENCY||LA17_0==K_AND||(LA17_0>=K_TIMESTAMP && LA17_0<=K_TTL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:45: ( K_AND )? usingClauseObjective[attrs]
            	    {
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:45: ( K_AND )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==K_AND) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:229:45: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClause927); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause930);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseDelete"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:232:1: usingClauseDelete[Attributes attrs] : K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ;
    public final void usingClauseDelete(Attributes attrs) throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:5: ( K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:7: K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete952); 
            pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete954);
            usingClauseDeleteObjective(attrs);

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:49: ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==K_CONSISTENCY||LA19_0==K_AND||LA19_0==K_TIMESTAMP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:51: ( K_AND )? usingClauseDeleteObjective[attrs]
            	    {
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:51: ( K_AND )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==K_AND) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:233:51: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClauseDelete959); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete962);
            	    usingClauseDeleteObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "usingClauseDeleteObjective"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:236:1: usingClauseDeleteObjective[Attributes attrs] : ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER );
    public final void usingClauseDeleteObjective(Attributes attrs) throws RecognitionException {
        Token ts=null;
        Token K_LEVEL2=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:237:5: ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==K_CONSISTENCY) ) {
                alt20=1;
            }
            else if ( (LA20_0==K_TIMESTAMP) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:237:7: K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_usingClauseDeleteObjective984); 
                    K_LEVEL2=(Token)match(input,K_LEVEL,FOLLOW_K_LEVEL_in_usingClauseDeleteObjective986); 
                     attrs.cLevel = ConsistencyLevel.valueOf((K_LEVEL2!=null?K_LEVEL2.getText():null).toUpperCase()); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:238:7: K_TIMESTAMP ts= INTEGER
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective997); 
                    ts=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseDeleteObjective1001); 
                     attrs.timestamp = Long.valueOf((ts!=null?ts.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDeleteObjective"


    // $ANTLR start "usingClauseObjective"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:241:1: usingClauseObjective[Attributes attrs] : ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER );
    public final void usingClauseObjective(Attributes attrs) throws RecognitionException {
        Token t=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:242:5: ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==K_CONSISTENCY||LA21_0==K_TIMESTAMP) ) {
                alt21=1;
            }
            else if ( (LA21_0==K_TTL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:242:7: usingClauseDeleteObjective[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1021);
                    usingClauseDeleteObjective(attrs);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:243:7: K_TTL t= INTEGER
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1030); 
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseObjective1034); 
                     attrs.timeToLive = Integer.valueOf((t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:246:1: updateStatement returns [UpdateStatement expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause ;
    public final UpdateStatement updateStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                Map<ColumnIdentifier, Operation> columns = new HashMap<ColumnIdentifier, Operation>();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:257:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:257:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1068); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1072);
            cf=columnFamilyName();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:258:7: ( usingClause[attrs] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_USING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:258:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1082);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1094); 
            pushFollow(FOLLOW_termPairWithOperation_in_updateStatement1096);
            termPairWithOperation(columns);

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:259:44: ( ',' termPairWithOperation[columns] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==104) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:259:45: ',' termPairWithOperation[columns]
            	    {
            	    match(input,104,FOLLOW_104_in_updateStatement1100); 
            	    pushFollow(FOLLOW_termPairWithOperation_in_updateStatement1102);
            	    termPairWithOperation(columns);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1113); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1117);
            wclause=whereClause();

            state._fsp--;


                      return new UpdateStatement(cf, columns, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "deleteStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:266:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (ids= cidentList )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ;
    public final DeleteStatement deleteStatement() throws RecognitionException {
        DeleteStatement expr = null;

        List<ColumnIdentifier> ids = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                List<ColumnIdentifier> columnsList = Collections.emptyList();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:277:5: ( K_DELETE (ids= cidentList )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:277:7: K_DELETE (ids= cidentList )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1157); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:277:16: (ids= cidentList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==K_COUNT||(LA24_0>=K_CONSISTENCY && LA24_0<=K_LEVEL)||(LA24_0>=K_VALUES && LA24_0<=K_TTL)||(LA24_0>=K_KEY && LA24_0<=K_CLUSTERING)||LA24_0==IDENT||LA24_0==K_TYPE||LA24_0==QUOTED_NAME||(LA24_0>=K_ASCII && LA24_0<=K_TIMEUUID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:277:18: ids= cidentList
                    {
                    pushFollow(FOLLOW_cidentList_in_deleteStatement1163);
                    ids=cidentList();

                    state._fsp--;

                     columnsList = ids; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1176); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1180);
            cf=columnFamilyName();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:279:7: ( usingClauseDelete[attrs] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_USING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:279:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1190);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1202); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1206);
            wclause=whereClause();

            state._fsp--;


                      return new DeleteStatement(cf, columnsList, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "batchStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:287:1: batchStatement returns [BatchStatement expr] : K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement batchStatement() throws RecognitionException {
        BatchStatement expr = null;

        ModificationStatement s1 = null;

        ModificationStatement sN = null;



                Attributes attrs = new Attributes();
                List<ModificationStatement> statements = new ArrayList<ModificationStatement>();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:316:5: ( K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:316:7: K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1247); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1249); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:316:23: ( usingClause[attrs] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_USING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:316:25: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1253);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1271);
            s1=batchStatementObjective();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:38: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==101) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:38: ';'
                    {
                    match(input,101,FOLLOW_101_in_batchStatement1273); 

                    }
                    break;

            }

             statements.add(s1); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:67: (sN= batchStatementObjective ( ';' )? )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==K_INSERT||LA29_0==K_UPDATE||LA29_0==K_DELETE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:69: sN= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1282);
            	    sN=batchStatementObjective();

            	    state._fsp--;

            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:96: ( ';' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==101) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:317:96: ';'
            	            {
            	            match(input,101,FOLLOW_101_in_batchStatement1284); 

            	            }
            	            break;

            	    }

            	     statements.add(sN); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement1298); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1300); 

                      return new BatchStatement(statements, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:324:1: batchStatementObjective returns [ModificationStatement statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement batchStatementObjective() throws RecognitionException {
        ModificationStatement statement = null;

        UpdateStatement i = null;

        UpdateStatement u = null;

        DeleteStatement d = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:325:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt30=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt30=1;
                }
                break;
            case K_UPDATE:
                {
                alt30=2;
                }
                break;
            case K_DELETE:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:325:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective1331);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:326:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective1344);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:327:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective1357);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:330:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ks= keyspaceName K_WITH props= properties ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;

        Map<String, String> props = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:334:5: ( K_CREATE K_KEYSPACE ks= keyspaceName K_WITH props= properties )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:334:7: K_CREATE K_KEYSPACE ks= keyspaceName K_WITH props= properties
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement1383); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1385); 
            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement1389);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement1397); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement1401);
            props=properties();

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, props); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createColumnFamilyStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:338:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateColumnFamilyStatement.RawStatement createColumnFamilyStatement() throws RecognitionException {
        CreateColumnFamilyStatement.RawStatement expr = null;

        CFName cf = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:346:5: ( K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:346:7: K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createColumnFamilyStatement1426); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1428); 
            pushFollow(FOLLOW_columnFamilyName_in_createColumnFamilyStatement1432);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateColumnFamilyStatement.RawStatement(cf); 
            pushFollow(FOLLOW_cfamDefinition_in_createColumnFamilyStatement1442);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createColumnFamilyStatement"


    // $ANTLR start "cfamDefinition"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:350:1: cfamDefinition[CreateColumnFamilyStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,102,FOLLOW_102_in_cfamDefinition1461); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1463);
            cfamColumns(expr);

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:29: ( ',' ( cfamColumns[expr] )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==104) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,104,FOLLOW_104_in_cfamDefinition1468); 
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:35: ( cfamColumns[expr] )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==K_COUNT||(LA31_0>=K_CONSISTENCY && LA31_0<=K_LEVEL)||(LA31_0>=K_VALUES && LA31_0<=K_TTL)||(LA31_0>=K_PRIMARY && LA31_0<=K_CLUSTERING)||LA31_0==IDENT||LA31_0==K_TYPE||LA31_0==QUOTED_NAME||(LA31_0>=K_ASCII && LA31_0<=K_TIMEUUID)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:351:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1470);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,103,FOLLOW_103_in_cfamDefinition1477); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:352:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==K_WITH) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:352:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition1487); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1489);
                    cfamProperty(expr);

                    state._fsp--;

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:352:35: ( K_AND cfamProperty[expr] )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==K_AND) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:352:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition1494); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1496);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:355:1: cfamColumns[CreateColumnFamilyStatement.RawStatement expr] : (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' k= cident ( ',' c= cident )* ')' );
    public final void cfamColumns(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        String v = null;

        ColumnIdentifier c = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:356:5: (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' k= cident ( ',' c= cident )* ')' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==K_COUNT||(LA37_0>=K_CONSISTENCY && LA37_0<=K_LEVEL)||(LA37_0>=K_VALUES && LA37_0<=K_TTL)||(LA37_0>=K_KEY && LA37_0<=K_CLUSTERING)||LA37_0==IDENT||LA37_0==K_TYPE||LA37_0==QUOTED_NAME||(LA37_0>=K_ASCII && LA37_0<=K_TIMEUUID)) ) {
                alt37=1;
            }
            else if ( (LA37_0==K_PRIMARY) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:356:7: k= cident v= comparatorType ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_cident_in_cfamColumns1522);
                    k=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns1526);
                    v=comparatorType();

                    state._fsp--;

                     expr.addDefinition(k, v); 
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:356:64: ( K_PRIMARY K_KEY )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==K_PRIMARY) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:356:65: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns1531); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns1533); 
                             expr.setKeyAlias(k); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:357:7: K_PRIMARY K_KEY '(' k= cident ( ',' c= cident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns1545); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns1547); 
                    match(input,102,FOLLOW_102_in_cfamColumns1549); 
                    pushFollow(FOLLOW_cident_in_cfamColumns1553);
                    k=cident();

                    state._fsp--;

                     expr.setKeyAlias(k); 
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:357:62: ( ',' c= cident )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==104) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:357:63: ',' c= cident
                    	    {
                    	    match(input,104,FOLLOW_104_in_cfamColumns1558); 
                    	    pushFollow(FOLLOW_cident_in_cfamColumns1562);
                    	    c=cident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match(input,103,FOLLOW_103_in_cfamColumns1569); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "cfamProperty"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:360:1: cfamProperty[CreateColumnFamilyStatement.RawStatement expr] : (k= property '=' v= propertyValue | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        String k = null;

        String v = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:361:5: (k= property '=' v= propertyValue | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case COMPIDENT:
                {
                alt39=1;
                }
                break;
            case K_COMPACT:
                {
                alt39=2;
                }
                break;
            case K_CLUSTERING:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:361:7: k= property '=' v= propertyValue
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty1589);
                    k=property();

                    state._fsp--;

                    match(input,106,FOLLOW_106_in_cfamProperty1591); 
                    pushFollow(FOLLOW_propertyValue_in_cfamProperty1595);
                    v=propertyValue();

                    state._fsp--;

                     expr.addProperty(k, v); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:362:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty1605); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty1607); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:363:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty1617); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty1619); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty1621); 
                    match(input,102,FOLLOW_102_in_cfamProperty1623); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty1625);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:363:56: ( ',' cfamOrdering[expr] )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==104) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:363:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,104,FOLLOW_104_in_cfamProperty1629); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty1631);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,103,FOLLOW_103_in_cfamProperty1636); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:366:1: cfamOrdering[CreateColumnFamilyStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:368:5: (k= cident ( K_ASC | K_DESC ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:368:7: k= cident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_cident_in_cfamOrdering1664);
            k=cident();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:368:16: ( K_ASC | K_DESC )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==K_ASC) ) {
                alt40=1;
            }
            else if ( (LA40_0==K_DESC) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:368:17: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering1667); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:368:25: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering1671); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:371:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        CFName cf = null;

        ColumnIdentifier id = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:375:5: ( K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:375:7: K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')'
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement1700); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement1702); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:375:24: (idxName= IDENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==IDENT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:375:25: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement1707); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement1711); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement1715);
            cf=columnFamilyName();

            state._fsp--;

            match(input,102,FOLLOW_102_in_createIndexStatement1717); 
            pushFollow(FOLLOW_cident_in_createIndexStatement1721);
            id=cident();

            state._fsp--;

            match(input,103,FOLLOW_103_in_createIndexStatement1723); 
             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "alterTableStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:379:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH props= properties ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier id = null;

        String v = null;

        Map<String, String> props = null;



                AlterTableStatement.Type type = null;
                props = new HashMap<String, String>();
            
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:390:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH props= properties ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:390:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH props= properties )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement1763); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement1765); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement1769);
            cf=columnFamilyName();

            state._fsp--;

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:391:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH props= properties )
            int alt42=4;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt42=1;
                }
                break;
            case K_ADD:
                {
                alt42=2;
                }
                break;
            case K_DROP:
                {
                alt42=3;
                }
                break;
            case K_WITH:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:391:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement1783); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement1787);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement1789); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement1793);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:392:13: K_ADD id= cident v= comparatorType
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement1809); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement1815);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement1819);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:393:13: K_DROP id= cident
                    {
                    match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement1842); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement1847);
                    id=cident();

                    state._fsp--;

                     type = AlterTableStatement.Type.DROP; 

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:394:13: K_WITH props= properties
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement1887); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement1892);
                    props=properties();

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:401:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:405:5: ( K_DROP K_KEYSPACE ks= keyspaceName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:405:7: K_DROP K_KEYSPACE ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement1952); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement1954); 
            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement1958);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropColumnFamilyStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:408:1: dropColumnFamilyStatement returns [DropColumnFamilyStatement stmt] : K_DROP K_COLUMNFAMILY cf= columnFamilyName ;
    public final DropColumnFamilyStatement dropColumnFamilyStatement() throws RecognitionException {
        DropColumnFamilyStatement stmt = null;

        CFName cf = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:412:5: ( K_DROP K_COLUMNFAMILY cf= columnFamilyName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:412:7: K_DROP K_COLUMNFAMILY cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropColumnFamilyStatement1983); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement1985); 
            pushFollow(FOLLOW_columnFamilyName_in_dropColumnFamilyStatement1989);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropColumnFamilyStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropColumnFamilyStatement"


    // $ANTLR start "dropIndexStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:415:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:419:5: ( K_DROP K_INDEX index= IDENT )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:420:7: K_DROP K_INDEX index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement2020); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement2022); 
            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement2026); 
             expr = new DropIndexStatement((index!=null?index.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:424:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:428:5: ( K_TRUNCATE cf= columnFamilyName )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:428:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement2057); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement2061);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "cident"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:432:1: cident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier cident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:436:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt43=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt43=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt43=2;
                }
                break;
            case K_COUNT:
            case K_CONSISTENCY:
            case K_LEVEL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_TTL:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_COUNTER:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:436:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident2091); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:437:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident2116); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:438:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident2135);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "keyspaceName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:442:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:444:5: ( cfOrKsName[name, true] )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:444:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName2168);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:447:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:449:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:449:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:449:7: ( cfOrKsName[name, true] '.' )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==107) ) {
                        alt44=1;
                    }
                    }
                    break;
                case QUOTED_NAME:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==107) ) {
                        alt44=1;
                    }
                    }
                    break;
                case K_COUNT:
                case K_CONSISTENCY:
                case K_LEVEL:
                case K_VALUES:
                case K_TTL:
                case K_KEY:
                case K_COMPACT:
                case K_STORAGE:
                case K_CLUSTERING:
                case K_TYPE:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (LA44_3==107) ) {
                        alt44=1;
                    }
                    }
                    break;
                case K_TIMESTAMP:
                case K_ASCII:
                case K_BIGINT:
                case K_BLOB:
                case K_BOOLEAN:
                case K_COUNTER:
                case K_DECIMAL:
                case K_DOUBLE:
                case K_FLOAT:
                case K_INT:
                case K_TEXT:
                case K_UUID:
                case K_VARCHAR:
                case K_VARINT:
                case K_TIMEUUID:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (LA44_4==107) ) {
                        alt44=1;
                    }
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:449:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName2202);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,107,FOLLOW_107_in_columnFamilyName2205); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName2209);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:452:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:453:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt45=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt45=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt45=2;
                }
                break;
            case K_COUNT:
            case K_CONSISTENCY:
            case K_LEVEL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_TTL:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_COUNTER:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:453:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName2230); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:454:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName2255); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:455:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName2274);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "cidentList"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:458:1: cidentList returns [List<ColumnIdentifier> items] : t1= cident ( ',' tN= cident )* ;
    public final List<ColumnIdentifier> cidentList() throws RecognitionException {
        List<ColumnIdentifier> items = null;

        ColumnIdentifier t1 = null;

        ColumnIdentifier tN = null;


         items = new ArrayList<ColumnIdentifier>(); 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:460:5: (t1= cident ( ',' tN= cident )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:460:8: t1= cident ( ',' tN= cident )*
            {
            pushFollow(FOLLOW_cident_in_cidentList2308);
            t1=cident();

            state._fsp--;

             items.add(t1); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:460:38: ( ',' tN= cident )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==104) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:460:39: ',' tN= cident
            	    {
            	    match(input,104,FOLLOW_104_in_cidentList2313); 
            	    pushFollow(FOLLOW_cident_in_cidentList2317);
            	    tN=cident();

            	    state._fsp--;

            	     items.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return items;
    }
    // $ANTLR end "cidentList"


    // $ANTLR start "extendedTerm"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:464:1: extendedTerm returns [Term term] : ( K_TOKEN '(' t= term ')' | t= term );
    public final Term extendedTerm() throws RecognitionException {
        Term term = null;

        Term t = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:465:5: ( K_TOKEN '(' t= term ')' | t= term )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==K_TOKEN) ) {
                alt47=1;
            }
            else if ( (LA47_0==INTEGER||(LA47_0>=STRING_LITERAL && LA47_0<=QMARK)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:465:7: K_TOKEN '(' t= term ')'
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_extendedTerm2343); 
                    match(input,102,FOLLOW_102_in_extendedTerm2345); 
                    pushFollow(FOLLOW_term_in_extendedTerm2349);
                    t=term();

                    state._fsp--;

                    match(input,103,FOLLOW_103_in_extendedTerm2351); 
                     term = Term.tokenOf(t); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:466:7: t= term
                    {
                    pushFollow(FOLLOW_term_in_extendedTerm2363);
                    t=term();

                    state._fsp--;

                     term = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "extendedTerm"


    // $ANTLR start "term"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:469:1: term returns [Term term] : (t= ( STRING_LITERAL | UUID | INTEGER | FLOAT ) | t= QMARK );
    public final Term term() throws RecognitionException {
        Term term = null;

        Token t=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:470:5: (t= ( STRING_LITERAL | UUID | INTEGER | FLOAT ) | t= QMARK )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==INTEGER||(LA48_0>=STRING_LITERAL && LA48_0<=FLOAT)) ) {
                alt48=1;
            }
            else if ( (LA48_0==QMARK) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:470:7: t= ( STRING_LITERAL | UUID | INTEGER | FLOAT )
                    {
                    t=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||(input.LA(1)>=STRING_LITERAL && input.LA(1)<=FLOAT) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     term = new Term((t!=null?t.getText():null), (t!=null?t.getType():0)); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:471:7: t= QMARK
                    {
                    t=(Token)match(input,QMARK,FOLLOW_QMARK_in_term2431); 
                     term = new Term((t!=null?t.getText():null), (t!=null?t.getType():0), ++currentBindMarkerIdx); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "intTerm"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:474:1: intTerm returns [Term integer] : (t= INTEGER | t= QMARK );
    public final Term intTerm() throws RecognitionException {
        Term integer = null;

        Token t=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:475:5: (t= INTEGER | t= QMARK )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==INTEGER) ) {
                alt49=1;
            }
            else if ( (LA49_0==QMARK) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:475:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intTerm2493); 
                     integer = new Term((t!=null?t.getText():null), (t!=null?t.getType():0)); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:476:7: t= QMARK
                    {
                    t=(Token)match(input,QMARK,FOLLOW_QMARK_in_intTerm2505); 
                     integer = new Term((t!=null?t.getText():null), (t!=null?t.getType():0), ++currentBindMarkerIdx); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return integer;
    }
    // $ANTLR end "intTerm"


    // $ANTLR start "termPairWithOperation"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:479:1: termPairWithOperation[Map<ColumnIdentifier, Operation> columns] : key= cident '=' (value= term | c= cident ( '+' v= intTerm | (op= '-' )? v= intTerm ) ) ;
    public final void termPairWithOperation(Map<ColumnIdentifier, Operation> columns) throws RecognitionException {
        Token op=null;
        ColumnIdentifier key = null;

        Term value = null;

        ColumnIdentifier c = null;

        Term v = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:480:5: (key= cident '=' (value= term | c= cident ( '+' v= intTerm | (op= '-' )? v= intTerm ) ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:480:7: key= cident '=' (value= term | c= cident ( '+' v= intTerm | (op= '-' )? v= intTerm ) )
            {
            pushFollow(FOLLOW_cident_in_termPairWithOperation2529);
            key=cident();

            state._fsp--;

            match(input,106,FOLLOW_106_in_termPairWithOperation2531); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:481:9: (value= term | c= cident ( '+' v= intTerm | (op= '-' )? v= intTerm ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==INTEGER||(LA52_0>=STRING_LITERAL && LA52_0<=QMARK)) ) {
                alt52=1;
            }
            else if ( (LA52_0==K_COUNT||(LA52_0>=K_CONSISTENCY && LA52_0<=K_LEVEL)||(LA52_0>=K_VALUES && LA52_0<=K_TTL)||(LA52_0>=K_KEY && LA52_0<=K_CLUSTERING)||LA52_0==IDENT||LA52_0==K_TYPE||LA52_0==QUOTED_NAME||(LA52_0>=K_ASCII && LA52_0<=K_TIMEUUID)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:481:11: value= term
                    {
                    pushFollow(FOLLOW_term_in_termPairWithOperation2545);
                    value=term();

                    state._fsp--;

                     columns.put(key, new Operation(value)); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:482:11: c= cident ( '+' v= intTerm | (op= '-' )? v= intTerm )
                    {
                    pushFollow(FOLLOW_cident_in_termPairWithOperation2561);
                    c=cident();

                    state._fsp--;

                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:482:20: ( '+' v= intTerm | (op= '-' )? v= intTerm )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==108) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==INTEGER||LA51_0==QMARK||LA51_0==109) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:482:22: '+' v= intTerm
                            {
                            match(input,108,FOLLOW_108_in_termPairWithOperation2565); 
                            pushFollow(FOLLOW_intTerm_in_termPairWithOperation2573);
                            v=intTerm();

                            state._fsp--;

                             columns.put(key, new Operation(c, Operation.Type.PLUS, v)); 

                            }
                            break;
                        case 2 :
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:483:22: (op= '-' )? v= intTerm
                            {
                            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:483:24: (op= '-' )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==109) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:483:24: op= '-'
                                    {
                                    op=(Token)match(input,109,FOLLOW_109_in_termPairWithOperation2600); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_intTerm_in_termPairWithOperation2605);
                            v=intTerm();

                            state._fsp--;


                                                   validateMinusSupplied(op, v, input);
                                                   if (op == null)
                                                       v = new Term(-(Long.valueOf(v.getText())), v.getType());
                                                   columns.put(key, new Operation(c, Operation.Type.MINUS, v));
                                                 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "termPairWithOperation"


    // $ANTLR start "property"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:494:1: property returns [String str] : p= ( COMPIDENT | IDENT ) ;
    public final String property() throws RecognitionException {
        String str = null;

        Token p=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:495:5: (p= ( COMPIDENT | IDENT ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:495:7: p= ( COMPIDENT | IDENT )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==IDENT||input.LA(1)==COMPIDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             str = (p!=null?p.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:498:1: propertyValue returns [String str] : (v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Token v=null;
        String u = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:499:5: (v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) | u= unreserved_keyword )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==INTEGER||LA53_0==IDENT||LA53_0==STRING_LITERAL||LA53_0==FLOAT) ) {
                alt53=1;
            }
            else if ( (LA53_0==K_COUNT||(LA53_0>=K_CONSISTENCY && LA53_0<=K_LEVEL)||(LA53_0>=K_VALUES && LA53_0<=K_TTL)||(LA53_0>=K_KEY && LA53_0<=K_CLUSTERING)||LA53_0==K_TYPE||(LA53_0>=K_ASCII && LA53_0<=K_TIMEUUID)) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:499:7: v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT )
                    {
                    v=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL||input.LA(1)==FLOAT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (v!=null?v.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:500:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue2740);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "properties"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:503:1: properties returns [Map<String, String> props] : k1= property '=' v1= propertyValue ( K_AND kn= property '=' vn= propertyValue )* ;
    public final Map<String, String> properties() throws RecognitionException {
        Map<String, String> props = null;

        String k1 = null;

        String v1 = null;

        String kn = null;

        String vn = null;


         props = new HashMap<String, String>(); 
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:505:5: (k1= property '=' v1= propertyValue ( K_AND kn= property '=' vn= propertyValue )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:505:7: k1= property '=' v1= propertyValue ( K_AND kn= property '=' vn= propertyValue )*
            {
            pushFollow(FOLLOW_property_in_properties2797);
            k1=property();

            state._fsp--;

            match(input,106,FOLLOW_106_in_properties2799); 
            pushFollow(FOLLOW_propertyValue_in_properties2803);
            v1=propertyValue();

            state._fsp--;

             props.put(k1, v1); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:505:64: ( K_AND kn= property '=' vn= propertyValue )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==K_AND) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:505:65: K_AND kn= property '=' vn= propertyValue
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties2808); 
            	    pushFollow(FOLLOW_property_in_properties2812);
            	    kn=property();

            	    state._fsp--;

            	    match(input,106,FOLLOW_106_in_properties2814); 
            	    pushFollow(FOLLOW_propertyValue_in_properties2818);
            	    vn=propertyValue();

            	    state._fsp--;

            	     props.put(kn, vn); 

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return props;
    }
    // $ANTLR end "properties"


    // $ANTLR start "relation"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:508:1: relation returns [Relation rel] : (name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term | K_TOKEN '(' name= cident ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) t= extendedTerm | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' );
    public final Relation relation() throws RecognitionException {
        Relation rel = null;

        Token type=null;
        ColumnIdentifier name = null;

        Term t = null;

        Term f1 = null;

        Term fN = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:509:5: (name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term | K_TOKEN '(' name= cident ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) t= extendedTerm | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==106||(LA56_1>=110 && LA56_1<=113)) ) {
                    alt56=1;
                }
                else if ( (LA56_1==K_IN) ) {
                    alt56=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case QUOTED_NAME:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==106||(LA56_2>=110 && LA56_2<=113)) ) {
                    alt56=1;
                }
                else if ( (LA56_2==K_IN) ) {
                    alt56=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_COUNT:
            case K_CONSISTENCY:
            case K_LEVEL:
            case K_VALUES:
            case K_TTL:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
                {
                int LA56_3 = input.LA(2);

                if ( (LA56_3==K_IN) ) {
                    alt56=3;
                }
                else if ( (LA56_3==106||(LA56_3>=110 && LA56_3<=113)) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }
                }
                break;
            case K_TIMESTAMP:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_COUNTER:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                int LA56_4 = input.LA(2);

                if ( (LA56_4==106||(LA56_4>=110 && LA56_4<=113)) ) {
                    alt56=1;
                }
                else if ( (LA56_4==K_IN) ) {
                    alt56=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 4, input);

                    throw nvae;
                }
                }
                break;
            case K_TOKEN:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:509:7: name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation2846);
                    name=cident();

                    state._fsp--;

                    type=(Token)input.LT(1);
                    if ( input.LA(1)==106||(input.LA(1)>=110 && input.LA(1)<=113) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_relation2872);
                    t=term();

                    state._fsp--;

                     rel = new Relation(name, (type!=null?type.getText():null), t); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:510:7: K_TOKEN '(' name= cident ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) t= extendedTerm
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation2882); 
                    match(input,102,FOLLOW_102_in_relation2884); 
                    pushFollow(FOLLOW_cident_in_relation2888);
                    name=cident();

                    state._fsp--;

                    match(input,103,FOLLOW_103_in_relation2890); 
                    type=(Token)input.LT(1);
                    if ( input.LA(1)==106||(input.LA(1)>=110 && input.LA(1)<=113) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_extendedTerm_in_relation2915);
                    t=extendedTerm();

                    state._fsp--;

                     rel = new Relation(name, (type!=null?type.getText():null), t, true); 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:511:7: name= cident K_IN '(' f1= term ( ',' fN= term )* ')'
                    {
                    pushFollow(FOLLOW_cident_in_relation2927);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation2929); 
                     rel = Relation.createInRelation(name); 
                    match(input,102,FOLLOW_102_in_relation2939); 
                    pushFollow(FOLLOW_term_in_relation2943);
                    f1=term();

                    state._fsp--;

                     rel.addInValue(f1); 
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:512:44: ( ',' fN= term )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==104) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:512:45: ',' fN= term
                    	    {
                    	    match(input,104,FOLLOW_104_in_relation2948); 
                    	    pushFollow(FOLLOW_term_in_relation2952);
                    	    fN=term();

                    	    state._fsp--;

                    	     rel.addInValue(fN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    match(input,103,FOLLOW_103_in_relation2959); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rel;
    }
    // $ANTLR end "relation"


    // $ANTLR start "comparatorType"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:515:1: comparatorType returns [String str] : (c= native_type | s= STRING_LITERAL );
    public final String comparatorType() throws RecognitionException {
        String str = null;

        Token s=null;
        String c = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:516:5: (c= native_type | s= STRING_LITERAL )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==K_TIMESTAMP||(LA57_0>=K_ASCII && LA57_0<=K_TIMEUUID)) ) {
                alt57=1;
            }
            else if ( (LA57_0==STRING_LITERAL) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:516:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType2982);
                    c=native_type();

                    state._fsp--;

                     str =c; 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:517:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType2997); 
                     str = (s!=null?s.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:520:1: native_type returns [String str] : c= ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID ) ;
    public final String native_type() throws RecognitionException {
        String str = null;

        Token c=null;

        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:521:5: (c= ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:521:7: c= ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            {
            c=(Token)input.LT(1);
            if ( input.LA(1)==K_TIMESTAMP||(input.LA(1)>=K_ASCII && input.LA(1)<=K_TIMEUUID) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             return (c!=null?c.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "unreserved_keyword"
    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:539:1: unreserved_keyword returns [String str] : (k= ( K_KEY | K_CONSISTENCY | K_CLUSTERING | K_LEVEL | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES ) | t= native_type );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String t = null;


        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:540:5: (k= ( K_KEY | K_CONSISTENCY | K_CLUSTERING | K_LEVEL | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES ) | t= native_type )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==K_COUNT||(LA58_0>=K_CONSISTENCY && LA58_0<=K_LEVEL)||LA58_0==K_VALUES||LA58_0==K_TTL||(LA58_0>=K_KEY && LA58_0<=K_CLUSTERING)||LA58_0==K_TYPE) ) {
                alt58=1;
            }
            else if ( (LA58_0==K_TIMESTAMP||(LA58_0>=K_ASCII && LA58_0<=K_TIMEUUID)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:540:7: k= ( K_KEY | K_CONSISTENCY | K_CLUSTERING | K_LEVEL | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_CONSISTENCY && input.LA(1)<=K_LEVEL)||input.LA(1)==K_VALUES||input.LA(1)==K_TTL||(input.LA(1)>=K_KEY && input.LA(1)<=K_CLUSTERING)||input.LA(1)==K_TYPE ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:551:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_keyword3357);
                    t=native_type();

                    state._fsp--;

                     str = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\2\37\7\uffff";
    static final String DFA2_maxS =
        "\1\56\7\uffff\2\47\7\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\16\1\10\1\11\1\12"+
        "\1\13\1\14\1\15";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\15\uffff\1\2\4\uffff\1\3\1\uffff\1\5\1\4\2\uffff\1"+
            "\10\13\uffff\1\12\2\uffff\1\11\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\1\14\5\uffff\1\15",
            "\1\16\1\uffff\1\17\5\uffff\1\20",
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
            return "128:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createColumnFamilyStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropColumnFamilyStatement_in_cqlStatement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement424 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement462 = new BitSet(new long[]{0xFF80897800E00640L,0x000002000000001FL});
    public static final BitSet FOLLOW_selectClause_in_selectStatement468 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement473 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_selectStatement475 = new BitSet(new long[]{0xFF80897800E08640L,0x000002000000001FL});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement479 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_selectStatement481 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement494 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement498 = new BitSet(new long[]{0x0000000000005902L});
    public static final BitSet FOLLOW_K_USING_in_selectStatement508 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_selectStatement510 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_LEVEL_in_selectStatement512 = new BitSet(new long[]{0x0000000000005802L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement527 = new BitSet(new long[]{0xFF81897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_whereClause_in_selectStatement531 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement544 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement546 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement548 = new BitSet(new long[]{0x0000000000004002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_selectStatement553 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement555 = new BitSet(new long[]{0x0000000000004002L,0x0000010000000000L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement572 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_selectStatement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cidentList_in_selectClause612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_selectClause622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_selectCountClause657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause707 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause712 = new BitSet(new long[]{0xFF81897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_relation_in_whereClause716 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_cident_in_orderByClause748 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement797 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement801 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_insertStatement813 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_insertStatement817 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_insertStatement824 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_insertStatement828 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_insertStatement835 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement845 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_insertStatement857 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_insertStatement861 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_insertStatement867 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_insertStatement871 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_insertStatement878 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause920 = new BitSet(new long[]{0x0000000000C00200L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause922 = new BitSet(new long[]{0x0000000000C10202L});
    public static final BitSet FOLLOW_K_AND_in_usingClause927 = new BitSet(new long[]{0x0000000000C00200L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause930 = new BitSet(new long[]{0x0000000000C10202L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete952 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete954 = new BitSet(new long[]{0x0000000000410202L});
    public static final BitSet FOLLOW_K_AND_in_usingClauseDelete959 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete962 = new BitSet(new long[]{0x0000000000410202L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_usingClauseDeleteObjective984 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_LEVEL_in_usingClauseDeleteObjective986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective997 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseDeleteObjective1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1030 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseObjective1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1068 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1072 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1094 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_termPairWithOperation_in_updateStatement1096 = new BitSet(new long[]{0x0000000000000800L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_updateStatement1100 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_termPairWithOperation_in_updateStatement1102 = new BitSet(new long[]{0x0000000000000800L,0x0000010000000000L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1113 = new BitSet(new long[]{0xFF81897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1157 = new BitSet(new long[]{0xFF80897800E006C0L,0x000000000000001FL});
    public static final BitSet FOLLOW_cidentList_in_deleteStatement1163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1176 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1180 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1202 = new BitSet(new long[]{0xFF81897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1249 = new BitSet(new long[]{0x0000000005080100L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1253 = new BitSet(new long[]{0x0000000005080100L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1271 = new BitSet(new long[]{0x0000000025080100L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_batchStatement1273 = new BitSet(new long[]{0x0000000025080100L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1282 = new BitSet(new long[]{0x0000000025080100L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_batchStatement1284 = new BitSet(new long[]{0x0000000025080100L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement1298 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement1383 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1385 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement1389 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement1397 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createColumnFamilyStatement1426 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1428 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createColumnFamilyStatement1432 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_cfamDefinition_in_createColumnFamilyStatement1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_cfamDefinition1461 = new BitSet(new long[]{0xFF80897C00E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1463 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_104_in_cfamDefinition1468 = new BitSet(new long[]{0xFF80897C00E00640L,0x000001800000001FL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1470 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_cfamDefinition1477 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition1487 = new BitSet(new long[]{0x0020015000000000L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1489 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition1494 = new BitSet(new long[]{0x0020015000000000L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1496 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_cident_in_cfamColumns1522 = new BitSet(new long[]{0xFF82897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns1526 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns1531 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns1545 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns1547 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_cfamColumns1549 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_cfamColumns1553 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_104_in_cfamColumns1558 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_cfamColumns1562 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_cfamColumns1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty1589 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_cfamProperty1591 = new BitSet(new long[]{0xFF8A897800E08640L,0x000000000000001FL});
    public static final BitSet FOLLOW_propertyValue_in_cfamProperty1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty1605 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty1617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty1619 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty1621 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_cfamProperty1623 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty1625 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_104_in_cfamProperty1629 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty1631 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_cfamProperty1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cfamOrdering1664 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement1700 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement1702 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement1707 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement1711 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement1715 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_createIndexStatement1717 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_createIndexStatement1721 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_createIndexStatement1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement1763 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement1765 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement1769 = new BitSet(new long[]{0x0000340100000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement1783 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement1787 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement1789 = new BitSet(new long[]{0xFF82897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement1809 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement1815 = new BitSet(new long[]{0xFF82897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_alterTableStatement1842 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement1887 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_properties_in_alterTableStatement1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement1952 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement1954 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropColumnFamilyStatement1983 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement1985 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_dropColumnFamilyStatement1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement2020 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement2022 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement2057 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName2202 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_columnFamilyName2205 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cidentList2308 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_cidentList2313 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_cidentList2317 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_K_TOKEN_in_extendedTerm2343 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_extendedTerm2345 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_extendedTerm2349 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_extendedTerm2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_extendedTerm2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_term2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intTerm2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intTerm2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation2529 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_termPairWithOperation2531 = new BitSet(new long[]{0xFF9E897800E08640L,0x000000000000001FL});
    public static final BitSet FOLLOW_term_in_termPairWithOperation2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation2561 = new BitSet(new long[]{0x0010000000008000L,0x0000300000000000L});
    public static final BitSet FOLLOW_108_in_termPairWithOperation2565 = new BitSet(new long[]{0x0010000000008000L,0x0000300000000000L});
    public static final BitSet FOLLOW_intTerm_in_termPairWithOperation2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_termPairWithOperation2600 = new BitSet(new long[]{0x0010000000008000L,0x0000300000000000L});
    public static final BitSet FOLLOW_intTerm_in_termPairWithOperation2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_property2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyValue2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties2797 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_properties2799 = new BitSet(new long[]{0xFF8A897800E08640L,0x000000000000001FL});
    public static final BitSet FOLLOW_propertyValue_in_properties2803 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_K_AND_in_properties2808 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_property_in_properties2812 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_properties2814 = new BitSet(new long[]{0xFF8A897800E08640L,0x000000000000001FL});
    public static final BitSet FOLLOW_propertyValue_in_properties2818 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_cident_in_relation2846 = new BitSet(new long[]{0x0000000000000000L,0x0003C40000000000L});
    public static final BitSet FOLLOW_set_in_relation2850 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_relation2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation2882 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_relation2884 = new BitSet(new long[]{0xFF80897800E00640L,0x000000000000001FL});
    public static final BitSet FOLLOW_cident_in_relation2888 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_relation2890 = new BitSet(new long[]{0x0000000000000000L,0x0003C40000000000L});
    public static final BitSet FOLLOW_set_in_relation2894 = new BitSet(new long[]{0x001F000000008000L});
    public static final BitSet FOLLOW_extendedTerm_in_relation2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation2927 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_K_IN_in_relation2929 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_relation2939 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_relation2943 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_104_in_relation2948 = new BitSet(new long[]{0x001E000000008000L});
    public static final BitSet FOLLOW_term_in_relation2952 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_relation2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_native_type3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_keyword3357 = new BitSet(new long[]{0x0000000000000002L});

}