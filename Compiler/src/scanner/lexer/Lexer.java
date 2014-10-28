/* The following code was generated by JFlex 1.6.0 */

package scanner.lexer;

import scanner.Token;
import scanner.TokenList;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>src/scanner/lexer/Lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\22\1\21\1\30\1\22\1\20\22\0\1\22\2\0\1\25"+
    "\3\0\1\24\1\12\1\13\1\10\1\3\1\0\1\4\1\17\1\11"+
    "\12\23\1\16\1\0\1\7\1\6\1\5\2\0\1\1\1\1\1\1"+
    "\1\1\1\2\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1"+
    "\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1"+
    "\1\1\1\1\1\1\1\14\1\0\1\15\3\0\32\1\1\26\1\0"+
    "\1\27\7\0\1\30\u1fa2\0\1\30\1\30\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\1\2\16"+
    "\1\17\3\1\1\2\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\16\1\0\1\31\2\0"+
    "\1\32\1\33\1\0\1\2\1\34\1\35\2\0\1\36"+
    "\1\0\1\33\1\2\2\0\1\2\1\0\1\36\172\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\31\0\226"+
    "\0\257\0\310\0\341\0\31\0\31\0\31\0\372\0\u0113"+
    "\0\31\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190\0\31\0\31"+
    "\0\u01a9\0\31\0\31\0\31\0\u01c2\0\31\0\31\0\u01db"+
    "\0\u01f4\0\31\0\u020d\0\u0226\0\31\0\u015e\0\u023f\0\u0258"+
    "\0\31\0\31\0\u0271\0\u028a\0\u02a3\0\u02bc\0\31\0\u02d5"+
    "\0\u02ee\0\u0307\0\u0320\0\u0339\0\u0339\0\u0352\0\u036b\0\u0384"+
    "\0\u039d\0\u03b6\0\u03cf\0\u03e8\0\u0401\0\u041a\0\u0433\0\u044c"+
    "\0\u0465\0\u047e\0\u0497\0\u04b0\0\u04c9\0\u04e2\0\u04fb\0\u0514"+
    "\0\u052d\0\u0546\0\u055f\0\u0578\0\u0591\0\u05aa\0\u05c3\0\u05dc"+
    "\0\u05f5\0\u060e\0\u0627\0\u0640\0\u0659\0\u0672\0\u068b\0\u06a4"+
    "\0\u06bd\0\u06d6\0\u06ef\0\u0708\0\u0721\0\u073a\0\u0753\0\u076c"+
    "\0\u0785\0\u079e\0\u07b7\0\u07d0\0\u07e9\0\u0802\0\u081b\0\u0834"+
    "\0\u084d\0\u0866\0\u087f\0\u0898\0\u08b1\0\u08ca\0\u08e3\0\u08fc"+
    "\0\u0915\0\u092e\0\u0947\0\u0960\0\u0979\0\u0992\0\u09ab\0\u09c4"+
    "\0\u09dd\0\u09f6\0\u0a0f\0\u0a28\0\u0a41\0\u0a5a\0\u0a73\0\u0a8c"+
    "\0\u0aa5\0\u0abe\0\u0ad7\0\u0af0\0\u0b09\0\u0b22\0\u0b3b\0\u0b54"+
    "\0\u0b6d\0\u0b86\0\u0b9f\0\u0bb8\0\u0bd1\0\u0bea\0\u0c03\0\u0c1c"+
    "\0\u0c35\0\u0c4e\0\u0c67\0\u0c80\0\u0c99\0\u0cb2\0\u0ccb\0\u0ce4"+
    "\0\u0cfd\0\u0d16\0\u0d2f\0\u0d48\0\u0d61\0\u0d7a\0\u0d93\0\u0dac"+
    "\0\u0dc5\0\u0dde\0\u0df7\0\u0e10\0\u0e29\0\u0e42\0\u0e5b\0\u0e74"+
    "\0\u0e8d\0\u0ea6\0\u0ebf\0\u0ed8\0\u0ef1\0\u0f0a\0\31";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\2\1\20"+
    "\2\21\1\22\1\23\1\24\1\25\1\2\33\0\2\26"+
    "\20\0\1\26\13\0\1\27\30\0\1\30\14\0\1\22"+
    "\12\0\1\31\1\32\27\0\1\33\1\34\1\35\27\0"+
    "\1\36\30\0\1\37\2\0\1\40\27\0\1\41\26\0"+
    "\1\42\43\0\1\21\26\0\1\43\3\0\1\22\5\0"+
    "\24\44\1\45\4\44\23\0\1\46\5\0\27\47\1\0"+
    "\1\47\1\0\2\50\20\0\1\50\13\0\1\51\30\0"+
    "\1\52\22\0\20\40\1\20\1\21\7\40\10\53\1\54"+
    "\20\53\23\0\1\55\5\0\24\56\1\57\4\56\27\47"+
    "\1\21\1\47\1\0\2\60\20\0\1\60\5\0\10\53"+
    "\1\61\20\53\10\0\1\54\2\0\1\21\17\0\1\62"+
    "\20\0\1\55\5\0\24\56\1\45\4\56\1\0\2\63"+
    "\20\0\1\63\5\0\10\53\1\61\2\53\1\21\15\53"+
    "\4\0\1\64\16\0\1\65\6\0\2\66\20\0\1\66"+
    "\30\0\1\65\6\0\2\67\20\0\1\67\6\0\2\70"+
    "\20\0\1\70\6\0\2\71\20\0\1\71\6\0\2\72"+
    "\20\0\1\72\6\0\2\73\20\0\1\73\6\0\2\74"+
    "\20\0\1\74\6\0\2\75\20\0\1\75\6\0\2\76"+
    "\20\0\1\76\6\0\2\77\20\0\1\77\6\0\2\100"+
    "\20\0\1\100\6\0\2\101\20\0\1\101\6\0\2\102"+
    "\20\0\1\102\6\0\2\103\20\0\1\103\6\0\2\104"+
    "\20\0\1\104\6\0\2\105\20\0\1\105\6\0\2\106"+
    "\20\0\1\106\6\0\2\107\20\0\1\107\6\0\2\110"+
    "\20\0\1\110\6\0\2\111\20\0\1\111\6\0\2\112"+
    "\20\0\1\112\6\0\2\113\20\0\1\113\6\0\2\114"+
    "\20\0\1\114\6\0\2\115\20\0\1\115\6\0\2\116"+
    "\20\0\1\116\6\0\2\117\20\0\1\117\6\0\2\120"+
    "\20\0\1\120\6\0\2\121\20\0\1\121\6\0\2\122"+
    "\20\0\1\122\6\0\2\123\20\0\1\123\6\0\2\124"+
    "\20\0\1\124\6\0\2\125\20\0\1\125\6\0\2\126"+
    "\20\0\1\126\6\0\2\127\20\0\1\127\6\0\2\130"+
    "\20\0\1\130\6\0\2\131\20\0\1\131\6\0\2\132"+
    "\20\0\1\132\6\0\2\133\20\0\1\133\6\0\2\134"+
    "\20\0\1\134\6\0\2\135\20\0\1\135\6\0\2\136"+
    "\20\0\1\136\6\0\2\137\20\0\1\137\6\0\2\140"+
    "\20\0\1\140\6\0\2\141\20\0\1\141\6\0\2\142"+
    "\20\0\1\142\6\0\2\143\20\0\1\143\6\0\2\144"+
    "\20\0\1\144\6\0\2\145\20\0\1\145\6\0\2\146"+
    "\20\0\1\146\6\0\2\147\20\0\1\147\6\0\2\150"+
    "\20\0\1\150\6\0\2\151\20\0\1\151\6\0\2\152"+
    "\20\0\1\152\6\0\2\153\20\0\1\153\6\0\2\154"+
    "\20\0\1\154\6\0\2\155\20\0\1\155\6\0\2\156"+
    "\20\0\1\156\6\0\2\157\20\0\1\157\6\0\2\160"+
    "\20\0\1\160\6\0\2\161\20\0\1\161\6\0\2\162"+
    "\20\0\1\162\6\0\2\163\20\0\1\163\6\0\2\164"+
    "\20\0\1\164\6\0\2\165\20\0\1\165\6\0\2\166"+
    "\20\0\1\166\6\0\2\167\20\0\1\167\6\0\2\170"+
    "\20\0\1\170\6\0\2\171\20\0\1\171\6\0\2\172"+
    "\20\0\1\172\6\0\2\173\20\0\1\173\6\0\2\174"+
    "\20\0\1\174\6\0\2\175\20\0\1\175\6\0\2\176"+
    "\20\0\1\176\6\0\2\177\20\0\1\177\6\0\2\200"+
    "\20\0\1\200\6\0\2\201\20\0\1\201\6\0\2\202"+
    "\20\0\1\202\6\0\2\203\20\0\1\203\6\0\2\204"+
    "\20\0\1\204\6\0\2\205\20\0\1\205\6\0\2\206"+
    "\20\0\1\206\6\0\2\207\20\0\1\207\6\0\2\210"+
    "\20\0\1\210\6\0\2\211\20\0\1\211\6\0\2\212"+
    "\20\0\1\212\6\0\2\213\20\0\1\213\6\0\2\214"+
    "\20\0\1\214\6\0\2\215\20\0\1\215\6\0\2\216"+
    "\20\0\1\216\6\0\2\217\20\0\1\217\6\0\2\220"+
    "\20\0\1\220\6\0\2\221\20\0\1\221\6\0\2\222"+
    "\20\0\1\222\6\0\2\223\20\0\1\223\6\0\2\224"+
    "\20\0\1\224\6\0\2\225\20\0\1\225\6\0\2\226"+
    "\20\0\1\226\6\0\2\227\20\0\1\227\6\0\2\230"+
    "\20\0\1\230\6\0\2\231\20\0\1\231\6\0\2\232"+
    "\20\0\1\232\6\0\2\233\20\0\1\233\6\0\2\234"+
    "\20\0\1\234\6\0\2\235\20\0\1\235\6\0\2\236"+
    "\20\0\1\236\6\0\2\237\20\0\1\237\6\0\2\240"+
    "\20\0\1\240\6\0\2\241\20\0\1\241\6\0\2\242"+
    "\20\0\1\242\6\0\2\243\20\0\1\243\6\0\2\244"+
    "\20\0\1\244\6\0\2\245\20\0\1\245\6\0\2\246"+
    "\20\0\1\246\6\0\2\247\20\0\1\247\6\0\2\250"+
    "\20\0\1\250\6\0\2\251\20\0\1\251\6\0\2\252"+
    "\20\0\1\252\6\0\2\253\20\0\1\253\6\0\2\254"+
    "\20\0\1\254\6\0\2\255\20\0\1\255\6\0\2\256"+
    "\20\0\1\256\6\0\2\257\20\0\1\257\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3875];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\4\1\3\11\2\1\1\11"+
    "\5\1\2\11\1\1\3\11\1\1\2\11\1\1\1\0"+
    "\1\11\2\0\1\11\1\1\1\0\1\1\2\11\2\0"+
    "\1\1\1\0\1\11\1\1\2\0\1\1\1\0\172\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[175];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private final TokenList tokenList;

    public TokenList getTokenList()
    {
        return this.tokenList;
    }

    private Token newToken(int type)
    {
        Token token = new Token(type, yytext(), yyline, yycolumn);
        tokenList.addToken(token);
        return token;
    }

    private Token newToken(int type, Object value)
    {
        Token token = new Token(type, value, yyline, yycolumn);
        tokenList.addToken(token);
        return token;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      tokenList = new TokenList();
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { Token token = new Token(0, yytext(), yyline, yycolumn);
    tokenList.addError(token);
    return token;
          }
        case 31: break;
        case 2: 
          { return newToken(ParserSym.IDENTIFIER);
          }
        case 32: break;
        case 3: 
          { return newToken(ParserSym.PLUS);
          }
        case 33: break;
        case 4: 
          { return newToken(ParserSym.MINUS);
          }
        case 34: break;
        case 5: 
          { return newToken(ParserSym.GREATER_THAN);
          }
        case 35: break;
        case 6: 
          { return newToken(ParserSym.EQUALS);
          }
        case 36: break;
        case 7: 
          { return newToken(ParserSym.LESS_THAN);
          }
        case 37: break;
        case 8: 
          { return newToken(ParserSym.TIMES);
          }
        case 38: break;
        case 9: 
          { return newToken(ParserSym.DIV);
          }
        case 39: break;
        case 10: 
          { return newToken(ParserSym.LPAREN);
          }
        case 40: break;
        case 11: 
          { return newToken(ParserSym.RPAREN);
          }
        case 41: break;
        case 12: 
          { return newToken(ParserSym.LBRACKET);
          }
        case 42: break;
        case 13: 
          { return newToken(ParserSym.RBRACKET);
          }
        case 43: break;
        case 14: 
          { /*Ignore*/
          }
        case 44: break;
        case 15: 
          { return newToken(ParserSym.NUMBER, new Integer(yytext()));
          }
        case 45: break;
        case 16: 
          { return newToken(ParserSym.PLUS_EQUALS);
          }
        case 46: break;
        case 17: 
          { return newToken(ParserSym.MINUS_EQUALS);
          }
        case 47: break;
        case 18: 
          { return newToken(ParserSym.SHIFT_RIGHT);
          }
        case 48: break;
        case 19: 
          { return newToken(ParserSym.GREATER_EQUALS_THAN);
          }
        case 49: break;
        case 20: 
          { return newToken(ParserSym.NOT_EQUALS);
          }
        case 50: break;
        case 21: 
          { return newToken(ParserSym.GREATER_LESS_THAN);
          }
        case 51: break;
        case 22: 
          { return newToken(ParserSym.SHIFT_LEFT);
          }
        case 52: break;
        case 23: 
          { return newToken(ParserSym.TIMES_EQUALS);
          }
        case 53: break;
        case 24: 
          { return newToken(ParserSym.DIV_EQUALS);
          }
        case 54: break;
        case 25: 
          { return newToken(ParserSym.ASSIGNMENT);
          }
        case 55: break;
        case 26: 
          { return newToken(ParserSym.STRING);
          }
        case 56: break;
        case 27: 
          { String text = yytext();
    Character c = null;

    // El caracter es de tipo #65, #97, etc..
    if (text.startsWith("#"))
    {
        int code = Integer.valueOf(text.substring(1));
        c = Character.toChars(code)[0];
    }
    // El caracter es de tipo 'A', 'b', etc...
    else
    {
        c = new Character(text.charAt(1));
    }

    return newToken(ParserSym.CHARACTER, c);
          }
        case 57: break;
        case 28: 
          { return newToken(ParserSym.SHIFT_RIGHT_EQUALS);
          }
        case 58: break;
        case 29: 
          { return newToken(ParserSym.SHIFT_LEFT_EQUALS);
          }
        case 59: break;
        case 30: 
          { return newToken(ParserSym.REAL, new Double(yytext()));
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   return new Token(ParserSym.EOF, yytext(), yyline, yycolumn);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}