// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g 2012-05-18 19:08:50

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.thrift.InvalidRequestException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlLexer extends Lexer {
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
    public static final int K_TYPE=43;
    public static final int K_KEYSPACE=31;
    public static final int K_COUNT=6;
    public static final int A=80;
    public static final int B=90;
    public static final int C=72;
    public static final int L=71;
    public static final int M=77;
    public static final int N=81;
    public static final int O=76;
    public static final int H=79;
    public static final int I=85;
    public static final int K_UPDATE=24;
    public static final int J=93;
    public static final int K=83;
    public static final int U=86;
    public static final int T=73;
    public static final int W=78;
    public static final int K_TEXT=64;
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
    public static final int K_VARCHAR=66;
    public static final int T__110=110;
    public static final int IDENT=40;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int DIGIT=95;
    public static final int K_BEGIN=27;
    public static final int INTEGER=15;
    public static final int K_COUNTER=59;
    public static final int K_DECIMAL=60;
    public static final int K_CONSISTENCY=9;
    public static final int COMPIDENT=53;
    public static final int K_WITH=32;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int K_IN=54;
    public static final int K_FROM=7;
    public static final int K_COLUMNFAMILY=33;
    public static final int K_DROP=45;
    public static final int K_BIGINT=56;
    public static final int K_TIMEUUID=68;

        List<Token> tokens = new ArrayList<Token>();

        public void emit(Token token)
        {
            state.token = token;
            tokens.add(token);
        }

        public Token nextToken()
        {
            super.nextToken();
            if (tokens.size() == 0)
                return Token.EOF_TOKEN;
            return tokens.remove(0);
        }

        private List<String> recognitionErrors = new ArrayList<String>();

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
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


    // delegates
    // delegators

    public CqlLexer() {;} 
    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g"; }

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ';' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '(' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ')' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( ',' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:53:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '\\*' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '\\*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( '=' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:55:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( '.' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:56:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( '+' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:57:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '-' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '<' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( '<=' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:60:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '>=' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '>' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "K_SELECT"
    public final void mK_SELECT() throws RecognitionException {
        try {
            int _type = K_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:556:9: ( S E L E C T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:556:16: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SELECT"

    // $ANTLR start "K_FROM"
    public final void mK_FROM() throws RecognitionException {
        try {
            int _type = K_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:557:7: ( F R O M )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:557:16: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FROM"

    // $ANTLR start "K_WHERE"
    public final void mK_WHERE() throws RecognitionException {
        try {
            int _type = K_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:558:8: ( W H E R E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:558:16: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WHERE"

    // $ANTLR start "K_AND"
    public final void mK_AND() throws RecognitionException {
        try {
            int _type = K_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:559:6: ( A N D )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:559:16: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AND"

    // $ANTLR start "K_KEY"
    public final void mK_KEY() throws RecognitionException {
        try {
            int _type = K_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:560:6: ( K E Y )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:560:16: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEY"

    // $ANTLR start "K_INSERT"
    public final void mK_INSERT() throws RecognitionException {
        try {
            int _type = K_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:561:9: ( I N S E R T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:561:16: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INSERT"

    // $ANTLR start "K_UPDATE"
    public final void mK_UPDATE() throws RecognitionException {
        try {
            int _type = K_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:562:9: ( U P D A T E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:562:16: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UPDATE"

    // $ANTLR start "K_WITH"
    public final void mK_WITH() throws RecognitionException {
        try {
            int _type = K_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:563:7: ( W I T H )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:563:16: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WITH"

    // $ANTLR start "K_LIMIT"
    public final void mK_LIMIT() throws RecognitionException {
        try {
            int _type = K_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:564:8: ( L I M I T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:564:16: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIMIT"

    // $ANTLR start "K_USING"
    public final void mK_USING() throws RecognitionException {
        try {
            int _type = K_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:565:8: ( U S I N G )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:565:16: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USING"

    // $ANTLR start "K_CONSISTENCY"
    public final void mK_CONSISTENCY() throws RecognitionException {
        try {
            int _type = K_CONSISTENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:566:14: ( C O N S I S T E N C Y )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:566:16: C O N S I S T E N C Y
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mI(); 
            mS(); 
            mT(); 
            mE(); 
            mN(); 
            mC(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONSISTENCY"

    // $ANTLR start "K_LEVEL"
    public final void mK_LEVEL() throws RecognitionException {
        try {
            int _type = K_LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:567:8: ( ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M | T W O | T H R E E ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:567:16: ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M | T W O | T H R E E )
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:567:16: ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M | T W O | T H R E E )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:567:18: O N E
                    {
                    mO(); 
                    mN(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:568:18: Q U O R U M
                    {
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 3 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:569:18: A L L
                    {
                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 4 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:570:18: A N Y
                    {
                    mA(); 
                    mN(); 
                    mY(); 

                    }
                    break;
                case 5 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:571:18: L O C A L '_' Q U O R U M
                    {
                    mL(); 
                    mO(); 
                    mC(); 
                    mA(); 
                    mL(); 
                    match('_'); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 6 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:572:18: E A C H '_' Q U O R U M
                    {
                    mE(); 
                    mA(); 
                    mC(); 
                    mH(); 
                    match('_'); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 7 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:573:18: T W O
                    {
                    mT(); 
                    mW(); 
                    mO(); 

                    }
                    break;
                case 8 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:574:18: T H R E E
                    {
                    mT(); 
                    mH(); 
                    mR(); 
                    mE(); 
                    mE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LEVEL"

    // $ANTLR start "K_USE"
    public final void mK_USE() throws RecognitionException {
        try {
            int _type = K_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:577:6: ( U S E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:577:16: U S E
            {
            mU(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USE"

    // $ANTLR start "K_COUNT"
    public final void mK_COUNT() throws RecognitionException {
        try {
            int _type = K_COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:578:8: ( C O U N T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:578:16: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:579:6: ( S E T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:579:16: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_BEGIN"
    public final void mK_BEGIN() throws RecognitionException {
        try {
            int _type = K_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:580:8: ( B E G I N )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:580:16: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BEGIN"

    // $ANTLR start "K_APPLY"
    public final void mK_APPLY() throws RecognitionException {
        try {
            int _type = K_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:581:8: ( A P P L Y )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:581:16: A P P L Y
            {
            mA(); 
            mP(); 
            mP(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_APPLY"

    // $ANTLR start "K_BATCH"
    public final void mK_BATCH() throws RecognitionException {
        try {
            int _type = K_BATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:582:8: ( B A T C H )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:582:16: B A T C H
            {
            mB(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BATCH"

    // $ANTLR start "K_TRUNCATE"
    public final void mK_TRUNCATE() throws RecognitionException {
        try {
            int _type = K_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:583:11: ( T R U N C A T E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:583:16: T R U N C A T E
            {
            mT(); 
            mR(); 
            mU(); 
            mN(); 
            mC(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TRUNCATE"

    // $ANTLR start "K_DELETE"
    public final void mK_DELETE() throws RecognitionException {
        try {
            int _type = K_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:584:9: ( D E L E T E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:584:16: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DELETE"

    // $ANTLR start "K_IN"
    public final void mK_IN() throws RecognitionException {
        try {
            int _type = K_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:585:5: ( I N )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:585:16: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IN"

    // $ANTLR start "K_CREATE"
    public final void mK_CREATE() throws RecognitionException {
        try {
            int _type = K_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:586:9: ( C R E A T E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:586:16: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CREATE"

    // $ANTLR start "K_KEYSPACE"
    public final void mK_KEYSPACE() throws RecognitionException {
        try {
            int _type = K_KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:587:11: ( ( K E Y S P A C E | S C H E M A ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:587:16: ( K E Y S P A C E | S C H E M A )
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:587:16: ( K E Y S P A C E | S C H E M A )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='K'||LA2_0=='k') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S'||LA2_0=='s') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:587:18: K E Y S P A C E
                    {
                    mK(); 
                    mE(); 
                    mY(); 
                    mS(); 
                    mP(); 
                    mA(); 
                    mC(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:588:20: S C H E M A
                    {
                    mS(); 
                    mC(); 
                    mH(); 
                    mE(); 
                    mM(); 
                    mA(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEYSPACE"

    // $ANTLR start "K_COLUMNFAMILY"
    public final void mK_COLUMNFAMILY() throws RecognitionException {
        try {
            int _type = K_COLUMNFAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:589:15: ( ( C O L U M N F A M I L Y | T A B L E ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:589:16: ( C O L U M N F A M I L Y | T A B L E )
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:589:16: ( C O L U M N F A M I L Y | T A B L E )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='C'||LA3_0=='c') ) {
                alt3=1;
            }
            else if ( (LA3_0=='T'||LA3_0=='t') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:589:18: C O L U M N F A M I L Y
                    {
                    mC(); 
                    mO(); 
                    mL(); 
                    mU(); 
                    mM(); 
                    mN(); 
                    mF(); 
                    mA(); 
                    mM(); 
                    mI(); 
                    mL(); 
                    mY(); 

                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:590:20: T A B L E
                    {
                    mT(); 
                    mA(); 
                    mB(); 
                    mL(); 
                    mE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COLUMNFAMILY"

    // $ANTLR start "K_INDEX"
    public final void mK_INDEX() throws RecognitionException {
        try {
            int _type = K_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:591:8: ( I N D E X )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:591:16: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INDEX"

    // $ANTLR start "K_ON"
    public final void mK_ON() throws RecognitionException {
        try {
            int _type = K_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:592:5: ( O N )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:592:16: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ON"

    // $ANTLR start "K_DROP"
    public final void mK_DROP() throws RecognitionException {
        try {
            int _type = K_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:593:7: ( D R O P )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:593:16: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DROP"

    // $ANTLR start "K_PRIMARY"
    public final void mK_PRIMARY() throws RecognitionException {
        try {
            int _type = K_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:594:10: ( P R I M A R Y )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:594:16: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PRIMARY"

    // $ANTLR start "K_INTO"
    public final void mK_INTO() throws RecognitionException {
        try {
            int _type = K_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:595:7: ( I N T O )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:595:16: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INTO"

    // $ANTLR start "K_VALUES"
    public final void mK_VALUES() throws RecognitionException {
        try {
            int _type = K_VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:596:9: ( V A L U E S )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:596:16: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VALUES"

    // $ANTLR start "K_TIMESTAMP"
    public final void mK_TIMESTAMP() throws RecognitionException {
        try {
            int _type = K_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:597:12: ( T I M E S T A M P )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:597:16: T I M E S T A M P
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TIMESTAMP"

    // $ANTLR start "K_TTL"
    public final void mK_TTL() throws RecognitionException {
        try {
            int _type = K_TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:598:6: ( T T L )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:598:16: T T L
            {
            mT(); 
            mT(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TTL"

    // $ANTLR start "K_ALTER"
    public final void mK_ALTER() throws RecognitionException {
        try {
            int _type = K_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:599:8: ( A L T E R )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:599:16: A L T E R
            {
            mA(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ALTER"

    // $ANTLR start "K_ADD"
    public final void mK_ADD() throws RecognitionException {
        try {
            int _type = K_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:600:6: ( A D D )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:600:16: A D D
            {
            mA(); 
            mD(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ADD"

    // $ANTLR start "K_TYPE"
    public final void mK_TYPE() throws RecognitionException {
        try {
            int _type = K_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:601:7: ( T Y P E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:601:16: T Y P E
            {
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TYPE"

    // $ANTLR start "K_COMPACT"
    public final void mK_COMPACT() throws RecognitionException {
        try {
            int _type = K_COMPACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:602:10: ( C O M P A C T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:602:16: C O M P A C T
            {
            mC(); 
            mO(); 
            mM(); 
            mP(); 
            mA(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COMPACT"

    // $ANTLR start "K_STORAGE"
    public final void mK_STORAGE() throws RecognitionException {
        try {
            int _type = K_STORAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:603:10: ( S T O R A G E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:603:16: S T O R A G E
            {
            mS(); 
            mT(); 
            mO(); 
            mR(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_STORAGE"

    // $ANTLR start "K_ORDER"
    public final void mK_ORDER() throws RecognitionException {
        try {
            int _type = K_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:604:8: ( O R D E R )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:604:16: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ORDER"

    // $ANTLR start "K_BY"
    public final void mK_BY() throws RecognitionException {
        try {
            int _type = K_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:605:5: ( B Y )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:605:16: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BY"

    // $ANTLR start "K_ASC"
    public final void mK_ASC() throws RecognitionException {
        try {
            int _type = K_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:606:6: ( A S C )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:606:16: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ASC"

    // $ANTLR start "K_DESC"
    public final void mK_DESC() throws RecognitionException {
        try {
            int _type = K_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:607:7: ( D E S C )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:607:16: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DESC"

    // $ANTLR start "K_CLUSTERING"
    public final void mK_CLUSTERING() throws RecognitionException {
        try {
            int _type = K_CLUSTERING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:608:13: ( C L U S T E R I N G )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:608:16: C L U S T E R I N G
            {
            mC(); 
            mL(); 
            mU(); 
            mS(); 
            mT(); 
            mE(); 
            mR(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CLUSTERING"

    // $ANTLR start "K_ASCII"
    public final void mK_ASCII() throws RecognitionException {
        try {
            int _type = K_ASCII;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:610:8: ( A S C I I )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:610:16: A S C I I
            {
            mA(); 
            mS(); 
            mC(); 
            mI(); 
            mI(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ASCII"

    // $ANTLR start "K_BIGINT"
    public final void mK_BIGINT() throws RecognitionException {
        try {
            int _type = K_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:611:9: ( B I G I N T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:611:16: B I G I N T
            {
            mB(); 
            mI(); 
            mG(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BIGINT"

    // $ANTLR start "K_BLOB"
    public final void mK_BLOB() throws RecognitionException {
        try {
            int _type = K_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:612:7: ( B L O B )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:612:16: B L O B
            {
            mB(); 
            mL(); 
            mO(); 
            mB(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BLOB"

    // $ANTLR start "K_BOOLEAN"
    public final void mK_BOOLEAN() throws RecognitionException {
        try {
            int _type = K_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:613:10: ( B O O L E A N )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:613:16: B O O L E A N
            {
            mB(); 
            mO(); 
            mO(); 
            mL(); 
            mE(); 
            mA(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BOOLEAN"

    // $ANTLR start "K_COUNTER"
    public final void mK_COUNTER() throws RecognitionException {
        try {
            int _type = K_COUNTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:614:10: ( C O U N T E R )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:614:16: C O U N T E R
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNTER"

    // $ANTLR start "K_DECIMAL"
    public final void mK_DECIMAL() throws RecognitionException {
        try {
            int _type = K_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:615:10: ( D E C I M A L )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:615:16: D E C I M A L
            {
            mD(); 
            mE(); 
            mC(); 
            mI(); 
            mM(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DECIMAL"

    // $ANTLR start "K_DOUBLE"
    public final void mK_DOUBLE() throws RecognitionException {
        try {
            int _type = K_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:616:9: ( D O U B L E )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:616:16: D O U B L E
            {
            mD(); 
            mO(); 
            mU(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DOUBLE"

    // $ANTLR start "K_FLOAT"
    public final void mK_FLOAT() throws RecognitionException {
        try {
            int _type = K_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:617:8: ( F L O A T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:617:16: F L O A T
            {
            mF(); 
            mL(); 
            mO(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FLOAT"

    // $ANTLR start "K_INT"
    public final void mK_INT() throws RecognitionException {
        try {
            int _type = K_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:618:6: ( I N T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:618:16: I N T
            {
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INT"

    // $ANTLR start "K_TEXT"
    public final void mK_TEXT() throws RecognitionException {
        try {
            int _type = K_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:619:7: ( T E X T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:619:16: T E X T
            {
            mT(); 
            mE(); 
            mX(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TEXT"

    // $ANTLR start "K_UUID"
    public final void mK_UUID() throws RecognitionException {
        try {
            int _type = K_UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:620:7: ( U U I D )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:620:16: U U I D
            {
            mU(); 
            mU(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UUID"

    // $ANTLR start "K_VARCHAR"
    public final void mK_VARCHAR() throws RecognitionException {
        try {
            int _type = K_VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:621:10: ( V A R C H A R )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:621:16: V A R C H A R
            {
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VARCHAR"

    // $ANTLR start "K_VARINT"
    public final void mK_VARINT() throws RecognitionException {
        try {
            int _type = K_VARINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:622:9: ( V A R I N T )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:622:16: V A R I N T
            {
            mV(); 
            mA(); 
            mR(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VARINT"

    // $ANTLR start "K_TIMEUUID"
    public final void mK_TIMEUUID() throws RecognitionException {
        try {
            int _type = K_TIMEUUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:623:11: ( T I M E U U I D )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:623:16: T I M E U U I D
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mU(); 
            mU(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TIMEUUID"

    // $ANTLR start "K_TOKEN"
    public final void mK_TOKEN() throws RecognitionException {
        try {
            int _type = K_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:624:8: ( T O K E N )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:624:16: T O K E N
            {
            mT(); 
            mO(); 
            mK(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TOKEN"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:627:11: ( ( 'a' | 'A' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:627:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:628:11: ( ( 'b' | 'B' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:628:13: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:629:11: ( ( 'c' | 'C' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:629:13: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:630:11: ( ( 'd' | 'D' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:630:13: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:631:11: ( ( 'e' | 'E' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:631:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:632:11: ( ( 'f' | 'F' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:632:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:633:11: ( ( 'g' | 'G' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:633:13: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:634:11: ( ( 'h' | 'H' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:634:13: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:635:11: ( ( 'i' | 'I' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:635:13: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:636:11: ( ( 'j' | 'J' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:636:13: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:637:11: ( ( 'k' | 'K' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:637:13: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:638:11: ( ( 'l' | 'L' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:638:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:639:11: ( ( 'm' | 'M' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:639:13: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:640:11: ( ( 'n' | 'N' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:640:13: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:641:11: ( ( 'o' | 'O' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:641:13: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:642:11: ( ( 'p' | 'P' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:642:13: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:643:11: ( ( 'q' | 'Q' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:643:13: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:644:11: ( ( 'r' | 'R' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:644:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:645:11: ( ( 's' | 'S' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:645:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:646:11: ( ( 't' | 'T' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:646:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:647:11: ( ( 'u' | 'U' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:647:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:648:11: ( ( 'v' | 'V' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:648:13: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:649:11: ( ( 'w' | 'W' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:649:13: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:650:11: ( ( 'x' | 'X' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:650:13: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:651:11: ( ( 'y' | 'Y' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:651:13: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:652:11: ( ( 'z' | 'Z' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:652:13: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

             StringBuilder b = new StringBuilder(); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:657:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:657:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:657:12: (c=~ ( '\\'' ) | '\\'' '\\'' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='\'') ) {
                        alt4=2;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:657:13: c=~ ( '\\'' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c);

            	    }
            	    break;
            	case 2 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:657:50: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 
            	     b.appendCodePoint('\''); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
             setText(b.toString());     }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "QUOTED_NAME"
    public final void mQUOTED_NAME() throws RecognitionException {
        try {
            int _type = QUOTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

             StringBuilder b = new StringBuilder(); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:663:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:663:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"'
            {
            match('\"'); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:663:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\"') ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:663:13: c=~ ( '\\\"' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:663:51: '\\\"' '\\\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 
            	     b.appendCodePoint('\"'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
             setText(b.toString());     }
        finally {
        }
    }
    // $ANTLR end "QUOTED_NAME"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:667:5: ( '0' .. '9' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:667:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:671:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:671:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:675:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:675:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:5: ( ( '-' )? ( DIGIT )+ )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:7: ( '-' )? ( DIGIT )+
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:7: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:12: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:679:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:683:5: ( '?' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:683:7: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:691:5: ( INTEGER '.' ( DIGIT )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:691:7: INTEGER '.' ( DIGIT )*
            {
            mINTEGER(); 
            match('.'); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:691:19: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:691:19: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:695:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:695:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:695:14: ( LETTER | DIGIT | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMPIDENT"
    public final void mCOMPIDENT() throws RecognitionException {
        try {
            int _type = COMPIDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:5: ( IDENT ( ':' ( IDENT | INTEGER ) )+ )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:7: IDENT ( ':' ( IDENT | INTEGER ) )+
            {
            mIDENT(); 
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:13: ( ':' ( IDENT | INTEGER ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==':') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:15: ':' ( IDENT | INTEGER )
            	    {
            	    match(':'); 
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:19: ( IDENT | INTEGER )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0=='-'||(LA10_0>='0' && LA10_0<='9')) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:20: IDENT
            	            {
            	            mIDENT(); 

            	            }
            	            break;
            	        case 2 :
            	            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:699:28: INTEGER
            	            {
            	            mINTEGER(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPIDENT"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:703:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:703:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
            {
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:711:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:711:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:711:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
            {
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:7: ( '--' | '//' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='-') ) {
                alt13=1;
            }
            else if ( (LA13_0=='/') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:8: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:15: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:21: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:715:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:719:5: ( '/*' ( . )* '*/' )
            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:719:7: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:719:12: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:719:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | COMPIDENT | UUID | WS | COMMENT | MULTILINE_COMMENT )
        int alt16=81;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__101
                {
                mT__101(); 

                }
                break;
            case 2 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__102
                {
                mT__102(); 

                }
                break;
            case 3 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__103
                {
                mT__103(); 

                }
                break;
            case 4 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__104
                {
                mT__104(); 

                }
                break;
            case 5 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__105
                {
                mT__105(); 

                }
                break;
            case 6 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__106
                {
                mT__106(); 

                }
                break;
            case 7 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__107
                {
                mT__107(); 

                }
                break;
            case 8 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__108
                {
                mT__108(); 

                }
                break;
            case 9 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__109
                {
                mT__109(); 

                }
                break;
            case 10 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__110
                {
                mT__110(); 

                }
                break;
            case 11 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__111
                {
                mT__111(); 

                }
                break;
            case 12 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__112
                {
                mT__112(); 

                }
                break;
            case 13 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__113
                {
                mT__113(); 

                }
                break;
            case 14 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:101: K_SELECT
                {
                mK_SELECT(); 

                }
                break;
            case 15 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:110: K_FROM
                {
                mK_FROM(); 

                }
                break;
            case 16 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:117: K_WHERE
                {
                mK_WHERE(); 

                }
                break;
            case 17 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:125: K_AND
                {
                mK_AND(); 

                }
                break;
            case 18 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:131: K_KEY
                {
                mK_KEY(); 

                }
                break;
            case 19 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:137: K_INSERT
                {
                mK_INSERT(); 

                }
                break;
            case 20 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:146: K_UPDATE
                {
                mK_UPDATE(); 

                }
                break;
            case 21 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:155: K_WITH
                {
                mK_WITH(); 

                }
                break;
            case 22 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:162: K_LIMIT
                {
                mK_LIMIT(); 

                }
                break;
            case 23 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:170: K_USING
                {
                mK_USING(); 

                }
                break;
            case 24 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:178: K_CONSISTENCY
                {
                mK_CONSISTENCY(); 

                }
                break;
            case 25 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:192: K_LEVEL
                {
                mK_LEVEL(); 

                }
                break;
            case 26 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:200: K_USE
                {
                mK_USE(); 

                }
                break;
            case 27 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:206: K_COUNT
                {
                mK_COUNT(); 

                }
                break;
            case 28 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:214: K_SET
                {
                mK_SET(); 

                }
                break;
            case 29 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:220: K_BEGIN
                {
                mK_BEGIN(); 

                }
                break;
            case 30 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:228: K_APPLY
                {
                mK_APPLY(); 

                }
                break;
            case 31 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:236: K_BATCH
                {
                mK_BATCH(); 

                }
                break;
            case 32 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:244: K_TRUNCATE
                {
                mK_TRUNCATE(); 

                }
                break;
            case 33 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:255: K_DELETE
                {
                mK_DELETE(); 

                }
                break;
            case 34 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:264: K_IN
                {
                mK_IN(); 

                }
                break;
            case 35 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:269: K_CREATE
                {
                mK_CREATE(); 

                }
                break;
            case 36 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:278: K_KEYSPACE
                {
                mK_KEYSPACE(); 

                }
                break;
            case 37 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:289: K_COLUMNFAMILY
                {
                mK_COLUMNFAMILY(); 

                }
                break;
            case 38 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:304: K_INDEX
                {
                mK_INDEX(); 

                }
                break;
            case 39 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:312: K_ON
                {
                mK_ON(); 

                }
                break;
            case 40 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:317: K_DROP
                {
                mK_DROP(); 

                }
                break;
            case 41 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:324: K_PRIMARY
                {
                mK_PRIMARY(); 

                }
                break;
            case 42 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:334: K_INTO
                {
                mK_INTO(); 

                }
                break;
            case 43 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:341: K_VALUES
                {
                mK_VALUES(); 

                }
                break;
            case 44 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:350: K_TIMESTAMP
                {
                mK_TIMESTAMP(); 

                }
                break;
            case 45 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:362: K_TTL
                {
                mK_TTL(); 

                }
                break;
            case 46 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:368: K_ALTER
                {
                mK_ALTER(); 

                }
                break;
            case 47 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:376: K_ADD
                {
                mK_ADD(); 

                }
                break;
            case 48 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:382: K_TYPE
                {
                mK_TYPE(); 

                }
                break;
            case 49 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:389: K_COMPACT
                {
                mK_COMPACT(); 

                }
                break;
            case 50 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:399: K_STORAGE
                {
                mK_STORAGE(); 

                }
                break;
            case 51 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:409: K_ORDER
                {
                mK_ORDER(); 

                }
                break;
            case 52 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:417: K_BY
                {
                mK_BY(); 

                }
                break;
            case 53 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:422: K_ASC
                {
                mK_ASC(); 

                }
                break;
            case 54 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:428: K_DESC
                {
                mK_DESC(); 

                }
                break;
            case 55 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:435: K_CLUSTERING
                {
                mK_CLUSTERING(); 

                }
                break;
            case 56 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:448: K_ASCII
                {
                mK_ASCII(); 

                }
                break;
            case 57 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:456: K_BIGINT
                {
                mK_BIGINT(); 

                }
                break;
            case 58 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:465: K_BLOB
                {
                mK_BLOB(); 

                }
                break;
            case 59 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:472: K_BOOLEAN
                {
                mK_BOOLEAN(); 

                }
                break;
            case 60 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:482: K_COUNTER
                {
                mK_COUNTER(); 

                }
                break;
            case 61 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:492: K_DECIMAL
                {
                mK_DECIMAL(); 

                }
                break;
            case 62 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:502: K_DOUBLE
                {
                mK_DOUBLE(); 

                }
                break;
            case 63 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:511: K_FLOAT
                {
                mK_FLOAT(); 

                }
                break;
            case 64 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:519: K_INT
                {
                mK_INT(); 

                }
                break;
            case 65 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:525: K_TEXT
                {
                mK_TEXT(); 

                }
                break;
            case 66 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:532: K_UUID
                {
                mK_UUID(); 

                }
                break;
            case 67 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:539: K_VARCHAR
                {
                mK_VARCHAR(); 

                }
                break;
            case 68 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:549: K_VARINT
                {
                mK_VARINT(); 

                }
                break;
            case 69 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:558: K_TIMEUUID
                {
                mK_TIMEUUID(); 

                }
                break;
            case 70 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:569: K_TOKEN
                {
                mK_TOKEN(); 

                }
                break;
            case 71 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:577: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 72 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:592: QUOTED_NAME
                {
                mQUOTED_NAME(); 

                }
                break;
            case 73 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:604: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 74 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:612: QMARK
                {
                mQMARK(); 

                }
                break;
            case 75 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:618: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 76 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:624: IDENT
                {
                mIDENT(); 

                }
                break;
            case 77 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:630: COMPIDENT
                {
                mCOMPIDENT(); 

                }
                break;
            case 78 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:640: UUID
                {
                mUUID(); 

                }
                break;
            case 79 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:645: WS
                {
                mWS(); 

                }
                break;
            case 80 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:648: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 81 :
                // /Users/pbailis/Research/cassandra-pbs/src/java/org/apache/cassandra/cql3/Cql.g:1:656: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\1\101\2\uffff\1\114\2\uffff\1\110\4\uffff";
    static final String DFA1_maxS =
        "\1\164\2\uffff\1\156\2\uffff\1\167\4\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\uffff\1\3\1\4\1\7\1\10";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\3\uffff\1\5\6\uffff\1\4\2\uffff\1\1\1\uffff\1\2\2\uffff"+
            "\1\6\14\uffff\1\3\3\uffff\1\5\6\uffff\1\4\2\uffff\1\1\1\uffff"+
            "\1\2\2\uffff\1\6",
            "",
            "",
            "\1\7\1\uffff\1\10\35\uffff\1\7\1\uffff\1\10",
            "",
            "",
            "\1\12\16\uffff\1\11\20\uffff\1\12\16\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "567:16: ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M | T W O | T H R E E )";
        }
    }
    static final String DFA16_eotS =
        "\11\uffff\1\46\1\50\1\52\21\53\2\uffff\1\135\1\uffff\1\53\3\uffff"+
        "\1\135\6\uffff\1\53\1\uffff\16\53\1\163\10\53\1\u0083\21\53\1\u0096"+
        "\5\53\2\uffff\1\135\2\uffff\2\53\1\u00a2\6\53\1\u00a9\1\u00ab\1"+
        "\53\1\u00ad\1\u00ab\1\u00ae\1\53\1\u00b0\1\uffff\1\u00b2\2\53\1"+
        "\u00b6\13\53\1\uffff\1\u00ab\3\53\1\u00c5\7\53\1\u00ab\5\53\1\uffff"+
        "\10\53\1\135\2\53\1\uffff\1\53\1\u00df\3\53\1\u00e3\1\uffff\1\53"+
        "\1\uffff\1\53\2\uffff\1\53\1\uffff\1\53\1\uffff\1\u00e8\2\53\1\uffff"+
        "\1\53\1\u00ec\14\53\1\uffff\2\53\1\u00fc\2\53\1\u00ff\5\53\1\u0105"+
        "\2\53\1\u0108\1\53\1\u010a\4\53\1\135\3\53\1\uffff\1\u0113\1\53"+
        "\1\u0115\1\uffff\1\u0116\1\u0117\1\u0118\1\53\1\uffff\1\u011a\1"+
        "\53\1\u011c\1\uffff\2\53\1\u011f\2\53\1\u0122\3\53\1\u0127\4\53"+
        "\1\u012c\1\uffff\1\53\1\u00ab\1\uffff\1\u012e\1\u012f\1\u0130\2"+
        "\53\1\uffff\2\53\1\uffff\1\53\1\uffff\4\53\1\135\1\53\1\u013c\1"+
        "\u013d\1\uffff\1\53\4\uffff\1\53\1\uffff\1\u0140\1\uffff\1\u0141"+
        "\1\53\1\uffff\2\53\1\uffff\3\53\1\u0148\1\uffff\1\u00ab\3\53\1\uffff"+
        "\1\53\3\uffff\1\u014d\2\53\1\u0150\1\u0151\2\53\1\u0154\1\u0155"+
        "\1\135\1\u0157\2\uffff\2\53\2\uffff\1\53\1\u015b\1\53\1\u015d\2"+
        "\53\1\uffff\4\53\1\uffff\1\u0164\1\u0165\2\uffff\1\u0166\1\u0167"+
        "\2\uffff\1\135\1\uffff\1\53\1\u013c\1\53\1\uffff\1\53\1\uffff\3"+
        "\53\1\u016e\1\53\1\u0170\4\uffff\1\135\5\53\1\uffff\1\u0176\1\uffff"+
        "\3\53\1\u017a\1\53\1\uffff\2\53\1\u017e\1\uffff\2\u00ab\1\u012c"+
        "\1\uffff";
    static final String DFA16_eofS =
        "\u017f\uffff";
    static final String DFA16_minS =
        "\1\11\10\uffff\1\55\2\75\21\60\2\uffff\1\56\1\uffff\1\60\1\uffff"+
        "\1\52\1\uffff\1\56\6\uffff\1\60\1\uffff\57\60\2\uffff\1\56\2\uffff"+
        "\21\60\1\uffff\17\60\1\uffff\22\60\1\uffff\10\60\1\56\2\60\1\uffff"+
        "\6\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\3\60\1\uffff\16\60\1\uffff\25\60\1\56\3\60\1\uffff\3\60\1\uffff"+
        "\4\60\1\uffff\3\60\1\uffff\17\60\1\uffff\2\60\1\uffff\5\60\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\4\60\1\56\3\60\1\uffff\1\60\4\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff\4\60\1\uffff"+
        "\4\60\1\uffff\1\60\3\uffff\11\60\1\56\1\60\2\uffff\2\60\2\uffff"+
        "\6\60\1\uffff\4\60\1\uffff\2\60\2\uffff\2\60\2\uffff\1\56\1\uffff"+
        "\1\55\2\60\1\uffff\1\60\1\uffff\6\60\4\uffff\1\55\5\60\1\uffff\1"+
        "\60\1\uffff\5\60\1\uffff\3\60\1\uffff\3\60\1\uffff";
    static final String DFA16_maxS =
        "\1\172\10\uffff\1\71\2\75\21\172\2\uffff\1\146\1\uffff\1\172\1\uffff"+
        "\1\57\1\uffff\1\71\6\uffff\1\172\1\uffff\57\172\2\uffff\1\146\2"+
        "\uffff\21\172\1\uffff\17\172\1\uffff\22\172\1\uffff\10\172\1\146"+
        "\2\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1"+
        "\uffff\1\172\1\uffff\3\172\1\uffff\16\172\1\uffff\25\172\1\146\3"+
        "\172\1\uffff\3\172\1\uffff\4\172\1\uffff\3\172\1\uffff\17\172\1"+
        "\uffff\2\172\1\uffff\5\172\1\uffff\2\172\1\uffff\1\172\1\uffff\4"+
        "\172\1\146\3\172\1\uffff\1\172\4\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\2\172\1\uffff\4\172\1\uffff\4\172\1\uffff\1\172\3"+
        "\uffff\11\172\1\146\1\172\2\uffff\2\172\2\uffff\6\172\1\uffff\4"+
        "\172\1\uffff\2\172\2\uffff\2\172\2\uffff\1\146\1\uffff\3\172\1\uffff"+
        "\1\172\1\uffff\6\172\4\uffff\1\71\5\172\1\uffff\1\172\1\uffff\5"+
        "\172\1\uffff\3\172\1\uffff\3\172\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\24\uffff\1\107\1\110\1"+
        "\uffff\1\112\1\uffff\1\117\1\uffff\1\120\1\uffff\1\11\1\13\1\12"+
        "\1\14\1\15\1\114\1\uffff\1\115\57\uffff\1\111\1\113\1\uffff\1\116"+
        "\1\121\21\uffff\1\42\17\uffff\1\47\22\uffff\1\64\13\uffff\1\34\6"+
        "\uffff\1\65\1\uffff\1\31\1\uffff\1\21\1\57\1\uffff\1\22\1\uffff"+
        "\1\100\3\uffff\1\32\16\uffff\1\55\31\uffff\1\17\3\uffff\1\25\4\uffff"+
        "\1\52\3\uffff\1\102\17\uffff\1\60\2\uffff\1\101\5\uffff\1\72\2\uffff"+
        "\1\66\1\uffff\1\50\10\uffff\1\77\1\uffff\1\20\1\70\1\56\1\36\1\uffff"+
        "\1\46\1\uffff\1\27\2\uffff\1\26\2\uffff\1\33\4\uffff\1\63\4\uffff"+
        "\1\45\1\uffff\1\106\1\35\1\37\13\uffff\1\44\1\16\2\uffff\1\23\1"+
        "\24\6\uffff\1\43\4\uffff\1\71\2\uffff\1\41\1\76\2\uffff\1\104\1"+
        "\53\1\uffff\1\62\3\uffff\1\61\1\uffff\1\74\6\uffff\1\73\1\75\1\51"+
        "\1\103\6\uffff\1\105\1\uffff\1\40\5\uffff\1\54\3\uffff\1\67\3\uffff"+
        "\1\30";
    static final String DFA16_specialS =
        "\u017f\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\uffff\1\36\4\uffff\1\35\1"+
            "\2\1\3\1\5\1\10\1\4\1\11\1\7\1\43\12\37\1\uffff\1\1\1\12\1\6"+
            "\1\13\1\40\1\uffff\1\17\1\31\1\24\1\32\1\27\1\15\2\41\1\21\1"+
            "\41\1\20\1\23\2\41\1\25\1\33\1\26\1\41\1\14\1\30\1\22\1\34\1"+
            "\16\3\41\6\uffff\1\17\1\31\1\24\1\32\1\27\1\15\2\41\1\21\1\41"+
            "\1\20\1\23\2\41\1\25\1\33\1\26\1\41\1\14\1\30\1\22\1\34\1\16"+
            "\3\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\45",
            "\1\47",
            "\1\51",
            "\12\60\1\55\6\uffff\2\60\1\56\1\60\1\57\16\60\1\54\6\60\4\uffff"+
            "\1\60\1\uffff\2\60\1\56\1\60\1\57\16\60\1\54\6\60",
            "\12\63\1\55\6\uffff\6\63\5\60\1\62\5\60\1\61\10\60\4\uffff"+
            "\1\60\1\uffff\6\63\5\60\1\62\5\60\1\61\10\60",
            "\12\60\1\55\6\uffff\7\60\1\64\1\65\21\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\64\1\65\21\60",
            "\12\63\1\55\6\uffff\3\63\1\71\2\63\5\60\1\67\1\60\1\70\1\60"+
            "\1\72\2\60\1\66\7\60\4\uffff\1\60\1\uffff\3\63\1\71\2\63\5\60"+
            "\1\67\1\60\1\70\1\60\1\72\2\60\1\66\7\60",
            "\12\60\1\55\6\uffff\4\60\1\73\25\60\4\uffff\1\60\1\uffff\4"+
            "\60\1\73\25\60",
            "\12\60\1\55\6\uffff\15\60\1\74\14\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\74\14\60",
            "\12\60\1\55\6\uffff\17\60\1\77\2\60\1\75\1\60\1\76\5\60\4\uffff"+
            "\1\60\1\uffff\17\60\1\77\2\60\1\75\1\60\1\76\5\60",
            "\12\60\1\55\6\uffff\10\60\1\101\5\60\1\100\13\60\4\uffff\1"+
            "\60\1\uffff\10\60\1\101\5\60\1\100\13\60",
            "\12\63\1\55\6\uffff\6\63\5\60\1\103\2\60\1\102\2\60\1\104\10"+
            "\60\4\uffff\1\60\1\uffff\6\63\5\60\1\103\2\60\1\102\2\60\1\104"+
            "\10\60",
            "\12\60\1\55\6\uffff\15\60\1\105\3\60\1\106\10\60\4\uffff\1"+
            "\60\1\uffff\15\60\1\105\3\60\1\106\10\60",
            "\12\60\1\55\6\uffff\24\60\1\107\5\60\4\uffff\1\60\1\uffff\24"+
            "\60\1\107\5\60",
            "\12\63\1\55\6\uffff\1\110\5\63\24\60\4\uffff\1\60\1\uffff\1"+
            "\110\5\63\24\60",
            "\12\60\1\55\6\uffff\1\113\3\60\1\117\2\60\1\116\1\112\5\60"+
            "\1\120\2\60\1\115\1\60\1\111\2\60\1\121\1\60\1\114\1\60\4\uffff"+
            "\1\60\1\uffff\1\113\3\60\1\117\2\60\1\116\1\112\5\60\1\120\2"+
            "\60\1\115\1\60\1\111\2\60\1\121\1\60\1\114\1\60",
            "\12\63\1\55\6\uffff\1\123\3\63\1\122\1\63\2\60\1\124\2\60\1"+
            "\126\2\60\1\125\11\60\1\127\1\60\4\uffff\1\60\1\uffff\1\123"+
            "\3\63\1\122\1\63\2\60\1\124\2\60\1\126\2\60\1\125\11\60\1\127"+
            "\1\60",
            "\12\63\1\55\6\uffff\4\63\1\130\1\63\10\60\1\131\2\60\1\132"+
            "\10\60\4\uffff\1\60\1\uffff\4\63\1\130\1\63\10\60\1\131\2\60"+
            "\1\132\10\60",
            "\12\60\1\55\6\uffff\21\60\1\133\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\133\10\60",
            "\12\60\1\55\6\uffff\1\134\31\60\4\uffff\1\60\1\uffff\1\134"+
            "\31\60",
            "",
            "",
            "\1\136\1\uffff\12\137\7\uffff\6\140\32\uffff\6\140",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\141\4\uffff\1\44",
            "",
            "\1\136\1\uffff\12\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\1\55\6\uffff\16\60\1\142\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\142\13\60",
            "",
            "\12\60\1\55\6\uffff\7\60\1\143\22\60\4\uffff\1\60\1\uffff\7"+
            "\60\1\143\22\60",
            "\12\60\1\55\6\uffff\13\60\1\145\7\60\1\144\6\60\4\uffff\1\60"+
            "\1\uffff\13\60\1\145\7\60\1\144\6\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\16\60\1\146\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\146\13\60",
            "\12\60\1\55\6\uffff\16\60\1\147\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\147\13\60",
            "\12\150\1\55\6\uffff\6\150\24\60\4\uffff\1\60\1\uffff\6\150"+
            "\24\60",
            "\12\60\1\55\6\uffff\4\60\1\151\25\60\4\uffff\1\60\1\uffff\4"+
            "\60\1\151\25\60",
            "\12\60\1\55\6\uffff\23\60\1\152\6\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\152\6\60",
            "\12\60\1\55\6\uffff\2\60\1\153\27\60\4\uffff\1\60\1\uffff\2"+
            "\60\1\153\27\60",
            "\12\60\1\55\6\uffff\13\60\1\154\7\60\1\155\6\60\4\uffff\1\60"+
            "\1\uffff\13\60\1\154\7\60\1\155\6\60",
            "\12\60\1\55\6\uffff\3\60\1\156\24\60\1\157\1\60\4\uffff\1\60"+
            "\1\uffff\3\60\1\156\24\60\1\157\1\60",
            "\12\150\1\55\6\uffff\3\150\1\160\2\150\24\60\4\uffff\1\60\1"+
            "\uffff\3\150\1\160\2\150\24\60",
            "\12\60\1\55\6\uffff\17\60\1\161\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\161\12\60",
            "\12\60\1\55\6\uffff\30\60\1\162\1\60\4\uffff\1\60\1\uffff\30"+
            "\60\1\162\1\60",
            "\12\60\1\55\6\uffff\3\60\1\165\16\60\1\166\1\164\6\60\4\uffff"+
            "\1\60\1\uffff\3\60\1\165\16\60\1\166\1\164\6\60",
            "\12\60\1\55\6\uffff\4\60\1\167\3\60\1\170\21\60\4\uffff\1\60"+
            "\1\uffff\4\60\1\167\3\60\1\170\21\60",
            "\12\60\1\55\6\uffff\10\60\1\171\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\171\21\60",
            "\12\60\1\55\6\uffff\3\60\1\172\26\60\4\uffff\1\60\1\uffff\3"+
            "\60\1\172\26\60",
            "\12\60\1\55\6\uffff\2\60\1\173\27\60\4\uffff\1\60\1\uffff\2"+
            "\60\1\173\27\60",
            "\12\60\1\55\6\uffff\14\60\1\174\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\174\15\60",
            "\12\60\1\55\6\uffff\13\60\1\176\1\175\1\u0080\6\60\1\177\5"+
            "\60\4\uffff\1\60\1\uffff\13\60\1\176\1\175\1\u0080\6\60\1\177"+
            "\5\60",
            "\12\60\1\55\6\uffff\24\60\1\u0081\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u0081\5\60",
            "\12\60\1\55\6\uffff\4\60\1\u0082\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0082\25\60",
            "\12\60\1\55\6\uffff\4\60\1\u0084\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0084\25\60",
            "\12\60\1\55\6\uffff\3\60\1\u0085\26\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u0085\26\60",
            "\12\60\1\55\6\uffff\16\60\1\u0086\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0086\13\60",
            "\12\150\1\55\6\uffff\2\150\1\u0087\3\150\24\60\4\uffff\1\60"+
            "\1\uffff\2\150\1\u0087\3\150\24\60",
            "\12\60\1\55\6\uffff\13\60\1\u0088\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u0088\16\60",
            "\12\60\1\55\6\uffff\14\60\1\u0089\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u0089\15\60",
            "\12\60\1\55\6\uffff\1\60\1\u008a\30\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u008a\30\60",
            "\12\60\1\55\6\uffff\17\60\1\u008b\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u008b\12\60",
            "\12\60\1\55\6\uffff\24\60\1\u008c\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u008c\5\60",
            "\12\60\1\55\6\uffff\21\60\1\u008d\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u008d\10\60",
            "\12\60\1\55\6\uffff\27\60\1\u008e\2\60\4\uffff\1\60\1\uffff"+
            "\27\60\1\u008e\2\60",
            "\12\60\1\55\6\uffff\12\60\1\u008f\17\60\4\uffff\1\60\1\uffff"+
            "\12\60\1\u008f\17\60",
            "\12\60\1\55\6\uffff\16\60\1\u0090\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0090\13\60",
            "\12\150\1\55\6\uffff\6\150\1\u0091\23\60\4\uffff\1\60\1\uffff"+
            "\6\150\1\u0091\23\60",
            "\12\150\1\55\6\uffff\6\150\15\60\1\u0092\6\60\4\uffff\1\60"+
            "\1\uffff\6\150\15\60\1\u0092\6\60",
            "\12\60\1\55\6\uffff\6\60\1\u0093\23\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u0093\23\60",
            "\12\60\1\55\6\uffff\16\60\1\u0094\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0094\13\60",
            "\12\60\1\55\6\uffff\16\60\1\u0095\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0095\13\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\150\1\55\6\uffff\2\150\1\u0097\3\150\5\60\1\u0098\6\60"+
            "\1\u0099\7\60\4\uffff\1\60\1\uffff\2\150\1\u0097\3\150\5\60"+
            "\1\u0098\6\60\1\u0099\7\60",
            "\12\60\1\55\6\uffff\24\60\1\u009a\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u009a\5\60",
            "\12\60\1\55\6\uffff\16\60\1\u009b\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u009b\13\60",
            "\12\60\1\55\6\uffff\10\60\1\u009c\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u009c\21\60",
            "\12\60\1\55\6\uffff\13\60\1\u009e\5\60\1\u009d\10\60\4\uffff"+
            "\1\60\1\uffff\13\60\1\u009e\5\60\1\u009d\10\60",
            "",
            "",
            "\1\136\1\uffff\12\u009f\7\uffff\6\140\32\uffff\6\140",
            "",
            "",
            "\12\60\1\55\6\uffff\21\60\1\u00a0\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00a0\10\60",
            "\12\60\1\55\6\uffff\4\60\1\u00a1\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00a1\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\4\60\1\u00a3\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00a3\25\60",
            "\12\60\1\55\6\uffff\14\60\1\u00a4\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u00a4\15\60",
            "\12\60\1\55\6\uffff\1\u00a5\31\60\4\uffff\1\60\1\uffff\1\u00a5"+
            "\31\60",
            "\12\u00a6\1\55\6\uffff\6\u00a6\24\60\4\uffff\1\60\1\uffff\6"+
            "\u00a6\24\60",
            "\12\60\1\55\6\uffff\21\60\1\u00a7\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00a7\10\60",
            "\12\60\1\55\6\uffff\7\60\1\u00a8\22\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u00a8\22\60",
            "\12\60\1\55\6\uffff\10\60\1\u00aa\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00aa\21\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\4\60\1\u00ac\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00ac\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\u00a6\1\55\6\uffff\6\u00a6\24\60\4\uffff\1\60\1\uffff\6"+
            "\u00a6\24\60",
            "\12\60\1\55\6\uffff\13\60\1\u00af\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00af\16\60",
            "\12\60\1\55\6\uffff\22\60\1\u00b1\7\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00b1\7\60",
            "",
            "\12\60\1\55\6\uffff\16\60\1\u00b3\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u00b3\13\60",
            "\12\60\1\55\6\uffff\4\60\1\u00b4\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00b4\25\60",
            "\12\60\1\55\6\uffff\4\60\1\u00b5\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00b5\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\15\60\1\u00b7\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00b7\14\60",
            "\12\60\1\55\6\uffff\3\60\1\u00b8\26\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u00b8\26\60",
            "\12\60\1\55\6\uffff\1\u00b9\31\60\4\uffff\1\60\1\uffff\1\u00b9"+
            "\31\60",
            "\12\60\1\55\6\uffff\1\u00ba\31\60\4\uffff\1\60\1\uffff\1\u00ba"+
            "\31\60",
            "\12\60\1\55\6\uffff\10\60\1\u00bb\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00bb\21\60",
            "\12\60\1\55\6\uffff\17\60\1\u00bc\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u00bc\12\60",
            "\12\60\1\55\6\uffff\24\60\1\u00bd\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u00bd\5\60",
            "\12\60\1\55\6\uffff\15\60\1\u00be\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00be\14\60",
            "\12\60\1\55\6\uffff\22\60\1\u00bf\7\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00bf\7\60",
            "\12\60\1\55\6\uffff\22\60\1\u00c0\7\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00c0\7\60",
            "\12\60\1\55\6\uffff\1\u00c1\31\60\4\uffff\1\60\1\uffff\1\u00c1"+
            "\31\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\4\60\1\u00c2\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00c2\25\60",
            "\12\60\1\55\6\uffff\21\60\1\u00c3\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00c3\10\60",
            "\12\u00a6\1\55\6\uffff\6\u00a6\1\60\1\u00c4\22\60\4\uffff\1"+
            "\60\1\uffff\6\u00a6\1\60\1\u00c4\22\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\4\60\1\u00c6\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00c6\25\60",
            "\12\60\1\55\6\uffff\13\60\1\u00c7\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00c7\16\60",
            "\12\60\1\55\6\uffff\4\60\1\u00c8\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00c8\25\60",
            "\12\60\1\55\6\uffff\15\60\1\u00c9\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00c9\14\60",
            "\12\60\1\55\6\uffff\4\60\1\u00ca\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00ca\25\60",
            "\12\60\1\55\6\uffff\23\60\1\u00cb\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00cb\6\60",
            "\12\60\1\55\6\uffff\4\60\1\u00cc\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00cc\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\10\60\1\u00cd\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00cd\21\60",
            "\12\60\1\55\6\uffff\2\60\1\u00ce\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00ce\27\60",
            "\12\60\1\55\6\uffff\10\60\1\u00cf\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00cf\21\60",
            "\12\60\1\55\6\uffff\13\60\1\u00d0\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00d0\16\60",
            "\12\60\1\55\6\uffff\1\60\1\u00d1\30\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u00d1\30\60",
            "",
            "\12\u00a6\1\55\6\uffff\6\u00a6\2\60\1\u00d2\21\60\4\uffff\1"+
            "\60\1\uffff\6\u00a6\2\60\1\u00d2\21\60",
            "\12\60\1\55\6\uffff\4\60\1\u00d3\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00d3\25\60",
            "\12\60\1\55\6\uffff\2\60\1\u00d4\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00d4\27\60",
            "\12\60\1\55\6\uffff\1\60\1\u00d5\30\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u00d5\30\60",
            "\12\60\1\55\6\uffff\17\60\1\u00d6\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u00d6\12\60",
            "\12\60\1\55\6\uffff\14\60\1\u00d7\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u00d7\15\60",
            "\12\60\1\55\6\uffff\2\60\1\u00d8\5\60\1\u00d9\21\60\4\uffff"+
            "\1\60\1\uffff\2\60\1\u00d8\5\60\1\u00d9\21\60",
            "\12\60\1\55\6\uffff\24\60\1\u00da\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u00da\5\60",
            "\1\136\1\uffff\12\u00db\7\uffff\6\140\32\uffff\6\140",
            "\12\60\1\55\6\uffff\1\u00dc\31\60\4\uffff\1\60\1\uffff\1\u00dc"+
            "\31\60",
            "\12\60\1\55\6\uffff\14\60\1\u00dd\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u00dd\15\60",
            "",
            "\12\60\1\55\6\uffff\2\60\1\u00de\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00de\27\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\23\60\1\u00e0\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00e0\6\60",
            "\12\u00e1\1\55\6\uffff\6\u00e1\24\60\4\uffff\1\60\1\uffff\6"+
            "\u00e1\24\60",
            "\12\60\1\55\6\uffff\4\60\1\u00e2\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00e2\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\10\60\1\u00e4\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00e4\21\60",
            "",
            "\12\60\1\55\6\uffff\21\60\1\u00e5\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00e5\10\60",
            "",
            "",
            "\12\60\1\55\6\uffff\30\60\1\u00e6\1\60\4\uffff\1\60\1\uffff"+
            "\30\60\1\u00e6\1\60",
            "",
            "\12\60\1\55\6\uffff\17\60\1\u00e7\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u00e7\12\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\27\60\1\u00e9\2\60\4\uffff\1\60\1\uffff"+
            "\27\60\1\u00e9\2\60",
            "\12\60\1\55\6\uffff\21\60\1\u00ea\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00ea\10\60",
            "",
            "\12\60\1\55\6\uffff\6\60\1\u00eb\23\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u00eb\23\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\23\60\1\u00ed\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00ed\6\60",
            "\12\60\1\55\6\uffff\13\60\1\u00ee\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00ee\16\60",
            "\12\60\1\55\6\uffff\23\60\1\u00ef\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00ef\6\60",
            "\12\60\1\55\6\uffff\1\u00f0\31\60\4\uffff\1\60\1\uffff\1\u00f0"+
            "\31\60",
            "\12\60\1\55\6\uffff\14\60\1\u00f1\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u00f1\15\60",
            "\12\60\1\55\6\uffff\23\60\1\u00f2\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00f2\6\60",
            "\12\60\1\55\6\uffff\10\60\1\u00f3\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00f3\21\60",
            "\12\60\1\55\6\uffff\23\60\1\u00f4\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00f4\6\60",
            "\12\60\1\55\6\uffff\23\60\1\u00f5\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00f5\6\60",
            "\12\60\1\55\6\uffff\21\60\1\u00f6\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00f6\10\60",
            "\12\60\1\55\6\uffff\24\60\1\u00f7\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u00f7\5\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\u00f8\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\22\60\1\u00fa\1\60\1\u00f9\5\60\4\uffff"+
            "\1\60\1\uffff\22\60\1\u00fa\1\60\1\u00f9\5\60",
            "\12\60\1\55\6\uffff\4\60\1\u00fb\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00fb\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\2\60\1\u00fd\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00fd\27\60",
            "\12\60\1\55\6\uffff\4\60\1\u00fe\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00fe\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\15\60\1\u0100\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0100\14\60",
            "\12\60\1\55\6\uffff\15\60\1\u0101\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0101\14\60",
            "\12\60\1\55\6\uffff\7\60\1\u0102\22\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u0102\22\60",
            "\12\60\1\55\6\uffff\15\60\1\u0103\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0103\14\60",
            "\12\60\1\55\6\uffff\4\60\1\u0104\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0104\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\14\60\1\u0106\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u0106\15\60",
            "\12\60\1\55\6\uffff\23\60\1\u0107\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0107\6\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\13\60\1\u0109\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u0109\16\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\1\u010b\31\60\4\uffff\1\60\1\uffff\1\u010b"+
            "\31\60",
            "\12\60\1\55\6\uffff\7\60\1\u010c\22\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u010c\22\60",
            "\12\60\1\55\6\uffff\15\60\1\u010d\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u010d\14\60",
            "\12\60\1\55\6\uffff\4\60\1\u010e\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u010e\25\60",
            "\1\136\1\uffff\12\u010f\7\uffff\6\140\32\uffff\6\140",
            "\12\60\1\55\6\uffff\6\60\1\u0110\23\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u0110\23\60",
            "\12\60\1\55\6\uffff\1\u0111\31\60\4\uffff\1\60\1\uffff\1\u0111"+
            "\31\60",
            "\12\60\1\55\6\uffff\23\60\1\u0112\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0112\6\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\u0114\1\55\6\uffff\6\u0114\24\60\4\uffff\1\60\1\uffff\6"+
            "\u0114\24\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\1\u0119\31\60\4\uffff\1\60\1\uffff\1\u0119"+
            "\31\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\23\60\1\u011b\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u011b\6\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\4\60\1\u011d\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u011d\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\u011e\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\2\60\1\u0120\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0120\27\60",
            "\12\60\1\55\6\uffff\15\60\1\u0121\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0121\14\60",
            "\12\60\1\55\6\uffff\4\60\1\u0123\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0123\25\60",
            "\12\60\1\55\6\uffff\22\60\1\u0124\7\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u0124\7\60",
            "\12\60\1\55\6\uffff\4\60\1\u0125\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0125\25\60",
            "\12\60\1\55\6\uffff\4\60\1\u0126\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0126\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\14\60\1\u0128\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u0128\15\60",
            "\12\60\1\55\6\uffff\20\60\1\u0129\11\60\4\uffff\1\60\1\uffff"+
            "\20\60\1\u0129\11\60",
            "\12\60\1\55\6\uffff\24\60\1\u012a\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u012a\5\60",
            "\12\60\1\55\6\uffff\23\60\1\u012b\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u012b\6\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\1\u012d\31\60\4\uffff\1\60\1\uffff\1\u012d"+
            "\31\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\23\60\1\u0131\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0131\6\60",
            "\12\60\1\55\6\uffff\1\u0132\31\60\4\uffff\1\60\1\uffff\1\u0132"+
            "\31\60",
            "",
            "\12\60\1\55\6\uffff\1\u0133\31\60\4\uffff\1\60\1\uffff\1\u0133"+
            "\31\60",
            "\12\60\1\55\6\uffff\4\60\1\u0134\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0134\25\60",
            "",
            "\12\60\1\55\6\uffff\4\60\1\u0135\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0135\25\60",
            "",
            "\12\60\1\55\6\uffff\21\60\1\u0136\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0136\10\60",
            "\12\60\1\55\6\uffff\1\u0137\31\60\4\uffff\1\60\1\uffff\1\u0137"+
            "\31\60",
            "\12\60\1\55\6\uffff\23\60\1\u0138\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0138\6\60",
            "\12\60\1\55\6\uffff\22\60\1\u0139\7\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u0139\7\60",
            "\1\136\1\uffff\12\u013a\7\uffff\6\140\32\uffff\6\140",
            "\12\60\1\55\6\uffff\4\60\1\u013b\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u013b\25\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\u013e\1\55\6\uffff\6\u013e\24\60\4\uffff\1\60\1\uffff\6"+
            "\u013e\24\60",
            "",
            "",
            "",
            "",
            "\12\60\1\55\6\uffff\2\60\1\u013f\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u013f\27\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\20\60\1\u0142\11\60\4\uffff\1\60\1\uffff"+
            "\20\60\1\u0142\11\60",
            "",
            "\12\60\1\55\6\uffff\23\60\1\u0143\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0143\6\60",
            "\12\60\1\55\6\uffff\5\60\1\u0144\24\60\4\uffff\1\60\1\uffff"+
            "\5\60\1\u0144\24\60",
            "",
            "\12\60\1\55\6\uffff\21\60\1\u0145\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0145\10\60",
            "\12\60\1\55\6\uffff\23\60\1\u0146\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0146\6\60",
            "\12\60\1\55\6\uffff\21\60\1\u0147\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0147\10\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\24\60\1\u0149\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u0149\5\60",
            "\12\60\1\55\6\uffff\10\60\1\u014a\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u014a\21\60",
            "\12\60\1\55\6\uffff\1\u014b\31\60\4\uffff\1\60\1\uffff\1\u014b"+
            "\31\60",
            "",
            "\12\60\1\55\6\uffff\23\60\1\u014c\6\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u014c\6\60",
            "",
            "",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\15\60\1\u014e\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u014e\14\60",
            "\12\60\1\55\6\uffff\13\60\1\u014f\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u014f\16\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\30\60\1\u0152\1\60\4\uffff\1\60\1\uffff"+
            "\30\60\1\u0152\1\60",
            "\12\60\1\55\6\uffff\21\60\1\u0153\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0153\10\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\136\1\uffff\12\u0156\7\uffff\6\140\32\uffff\6\140",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\u0158\1\55\6\uffff\6\u0158\24\60\4\uffff\1\60\1\uffff\6"+
            "\u0158\24\60",
            "\12\60\1\55\6\uffff\4\60\1\u0159\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0159\25\60",
            "",
            "",
            "\12\60\1\55\6\uffff\24\60\1\u015a\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u015a\5\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\1\u015c\31\60\4\uffff\1\60\1\uffff\1\u015c"+
            "\31\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\4\60\1\u015e\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u015e\25\60",
            "\12\60\1\55\6\uffff\10\60\1\u015f\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u015f\21\60",
            "",
            "\12\60\1\55\6\uffff\16\60\1\u0160\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0160\13\60",
            "\12\60\1\55\6\uffff\3\60\1\u0161\26\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u0161\26\60",
            "\12\60\1\55\6\uffff\14\60\1\u0162\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u0162\15\60",
            "\12\60\1\55\6\uffff\4\60\1\u0163\25\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0163\25\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\136\1\uffff\12\u0168\7\uffff\6\140\32\uffff\6\140",
            "",
            "\1\140\2\uffff\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\16\60\1\u0169\13\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0169\13\60",
            "",
            "\12\60\1\55\6\uffff\14\60\1\u016a\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u016a\15\60",
            "",
            "\12\60\1\55\6\uffff\15\60\1\u016b\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u016b\14\60",
            "\12\60\1\55\6\uffff\15\60\1\u016c\14\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u016c\14\60",
            "\12\60\1\55\6\uffff\21\60\1\u016d\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u016d\10\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\17\60\1\u016f\12\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u016f\12\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\1\140\1\136\1\uffff\12\45",
            "\12\60\1\55\6\uffff\21\60\1\u0171\10\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0171\10\60",
            "\12\60\1\55\6\uffff\10\60\1\u0172\21\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0172\21\60",
            "\12\60\1\55\6\uffff\2\60\1\u0173\27\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0173\27\60",
            "\12\60\1\55\6\uffff\6\60\1\u0174\23\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u0174\23\60",
            "\12\60\1\55\6\uffff\24\60\1\u0175\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u0175\5\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\24\60\1\u0177\5\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u0177\5\60",
            "\12\60\1\55\6\uffff\13\60\1\u0178\16\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u0178\16\60",
            "\12\60\1\55\6\uffff\30\60\1\u0179\1\60\4\uffff\1\60\1\uffff"+
            "\30\60\1\u0179\1\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\14\60\1\u017b\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u017b\15\60",
            "",
            "\12\60\1\55\6\uffff\14\60\1\u017c\15\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u017c\15\60",
            "\12\60\1\55\6\uffff\30\60\1\u017d\1\60\4\uffff\1\60\1\uffff"+
            "\30\60\1\u017d\1\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\1\55\6\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | COMPIDENT | UUID | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}