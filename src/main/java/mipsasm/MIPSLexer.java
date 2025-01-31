// Generated from mipsasm\MIPSLexer.g4 by ANTLR 4.9.1
package mipsasm;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MIPSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, MODIFIER_HI=3, MODIFIER_LO=4, MODIFIER_PCREL_HI=5, 
		MODIFIER_PCREL_LO=6, DOT_ATTRIBUTE=7, DOT_ALIGN=8, DOT_EQU=9, DOT_EXTERN=10, 
		DOT_SECTION=11, DOT_GLOBL=12, DOT_GLOBAL=13, DOT_TEXT=14, DOT_TYPE=15, 
		DOT_DATA=16, DOT_BYTE=17, DOT_SPACE=18, DOT_HALF=19, DOT_WEAK=20, DOT_WORD=21, 
		DOT_DWORD=22, DOT_FILE=23, DOT_RODATA=24, DOT_ASCII=25, DOT_ASCIZ=26, 
		DOT_ASCIIZ=27, DOT_SKIP=28, DOT_STRING=29, DOT_OPTION=30, DOT_SIZE=31, 
		DOT_IDENT=32, I_ADD=33, I_ADDI=34, I_ADDIU=35, I_AND=36, I_ANDI=37, I_AUIPC=38, 
		I_BEQ=39, I_BEQZ=40, I_BGE=41, I_BGT=42, I_BLT=43, I_BLE=44, I_BNE=45, 
		I_BNEZ=46, I_CALL=47, I_ECALL=48, I_J=49, I_JR=50, I_JAL=51, I_JALR=52, 
		I_LA=53, I_LD=54, I_LW=55, I_LH=56, I_LB=57, I_LBU=58, I_LI=59, I_LUI=60, 
		I_MUL=61, I_MV=62, I_NOP=63, I_NOT=64, I_OR=65, I_RET=66, I_SLT=67, I_SRAI=68, 
		I_SRLI=69, I_SLLI=70, I_SUB=71, I_SD=72, I_SW=73, I_SH=74, I_SB=75, I_SYSCALL=76, 
		I_WFI=77, I_XORI=78, REG_ZERO_ABI=79, REG_AT_ABI=80, REG_V0_ABI=81, REG_V1_ABI=82, 
		REG_A0_ABI=83, REG_A1_ABI=84, REG_A2_ABI=85, REG_A3_ABI=86, REG_T0_ABI=87, 
		REG_T1_ABI=88, REG_T2_ABI=89, REG_T3_ABI=90, REG_T4_ABI=91, REG_T5_ABI=92, 
		REG_T6_ABI=93, REG_T7_ABI=94, REG_S0_ABI=95, REG_S1_ABI=96, REG_S2_ABI=97, 
		REG_S3_ABI=98, REG_S4_ABI=99, REG_S5_ABI=100, REG_S6_ABI=101, REG_S7_ABI=102, 
		REG_T8_ABI=103, REG_T9_ABI=104, REG_K0_ABI=105, REG_K1_ABI=106, REG_GP_ABI=107, 
		REG_SP_ABI=108, REG_FP_ABI=109, REG_RA_ABI=110, ASTERISK=111, PLUS=112, 
		MINUS=113, PERCENT=114, DOT=115, DOLLAR=116, COLON=117, COMMA=118, OPENING_BRACKET=119, 
		CLOSING_BRACKET=120, NUMERIC=121, HEX_NUMERIC=122, IDENTIFIER=123, WS=124, 
		STRING_LITERAL=125, UNTERMINATED_STRING_LITERAL=126, NEWLINE=127;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LINE_COMMENT", "BLOCK_COMMENT", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
			"W", "X", "Y", "Z", "MODIFIER_HI", "MODIFIER_LO", "MODIFIER_PCREL_HI", 
			"MODIFIER_PCREL_LO", "DOT_ATTRIBUTE", "DOT_ALIGN", "DOT_EQU", "DOT_EXTERN", 
			"DOT_SECTION", "DOT_GLOBL", "DOT_GLOBAL", "DOT_TEXT", "DOT_TYPE", "DOT_DATA", 
			"DOT_BYTE", "DOT_SPACE", "DOT_HALF", "DOT_WEAK", "DOT_WORD", "DOT_DWORD", 
			"DOT_FILE", "DOT_RODATA", "DOT_ASCII", "DOT_ASCIZ", "DOT_ASCIIZ", "DOT_SKIP", 
			"DOT_STRING", "DOT_OPTION", "DOT_SIZE", "DOT_IDENT", "I_ADD", "I_ADDI", 
			"I_ADDIU", "I_AND", "I_ANDI", "I_AUIPC", "I_BEQ", "I_BEQZ", "I_BGE", 
			"I_BGT", "I_BLT", "I_BLE", "I_BNE", "I_BNEZ", "I_CALL", "I_ECALL", "I_J", 
			"I_JR", "I_JAL", "I_JALR", "I_LA", "I_LD", "I_LW", "I_LH", "I_LB", "I_LBU", 
			"I_LI", "I_LUI", "I_MUL", "I_MV", "I_NOP", "I_NOT", "I_OR", "I_RET", 
			"I_SLT", "I_SRAI", "I_SRLI", "I_SLLI", "I_SUB", "I_SD", "I_SW", "I_SH", 
			"I_SB", "I_SYSCALL", "I_WFI", "I_XORI", "REG_ZERO_ABI", "REG_AT_ABI", 
			"REG_V0_ABI", "REG_V1_ABI", "REG_A0_ABI", "REG_A1_ABI", "REG_A2_ABI", 
			"REG_A3_ABI", "REG_T0_ABI", "REG_T1_ABI", "REG_T2_ABI", "REG_T3_ABI", 
			"REG_T4_ABI", "REG_T5_ABI", "REG_T6_ABI", "REG_T7_ABI", "REG_S0_ABI", 
			"REG_S1_ABI", "REG_S2_ABI", "REG_S3_ABI", "REG_S4_ABI", "REG_S5_ABI", 
			"REG_S6_ABI", "REG_S7_ABI", "REG_T8_ABI", "REG_T9_ABI", "REG_K0_ABI", 
			"REG_K1_ABI", "REG_GP_ABI", "REG_SP_ABI", "REG_FP_ABI", "REG_RA_ABI", 
			"ASTERISK", "PLUS", "MINUS", "PERCENT", "DOT", "DOLLAR", "COLON", "COMMA", 
			"OPENING_BRACKET", "CLOSING_BRACKET", "NUMERIC", "HEX_NUMERIC", "IDENTIFIER", 
			"WS", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*'", "'+'", "'-'", "'%'", "'.'", "'$'", "':'", "','", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "BLOCK_COMMENT", "MODIFIER_HI", "MODIFIER_LO", 
			"MODIFIER_PCREL_HI", "MODIFIER_PCREL_LO", "DOT_ATTRIBUTE", "DOT_ALIGN", 
			"DOT_EQU", "DOT_EXTERN", "DOT_SECTION", "DOT_GLOBL", "DOT_GLOBAL", "DOT_TEXT", 
			"DOT_TYPE", "DOT_DATA", "DOT_BYTE", "DOT_SPACE", "DOT_HALF", "DOT_WEAK", 
			"DOT_WORD", "DOT_DWORD", "DOT_FILE", "DOT_RODATA", "DOT_ASCII", "DOT_ASCIZ", 
			"DOT_ASCIIZ", "DOT_SKIP", "DOT_STRING", "DOT_OPTION", "DOT_SIZE", "DOT_IDENT", 
			"I_ADD", "I_ADDI", "I_ADDIU", "I_AND", "I_ANDI", "I_AUIPC", "I_BEQ", 
			"I_BEQZ", "I_BGE", "I_BGT", "I_BLT", "I_BLE", "I_BNE", "I_BNEZ", "I_CALL", 
			"I_ECALL", "I_J", "I_JR", "I_JAL", "I_JALR", "I_LA", "I_LD", "I_LW", 
			"I_LH", "I_LB", "I_LBU", "I_LI", "I_LUI", "I_MUL", "I_MV", "I_NOP", "I_NOT", 
			"I_OR", "I_RET", "I_SLT", "I_SRAI", "I_SRLI", "I_SLLI", "I_SUB", "I_SD", 
			"I_SW", "I_SH", "I_SB", "I_SYSCALL", "I_WFI", "I_XORI", "REG_ZERO_ABI", 
			"REG_AT_ABI", "REG_V0_ABI", "REG_V1_ABI", "REG_A0_ABI", "REG_A1_ABI", 
			"REG_A2_ABI", "REG_A3_ABI", "REG_T0_ABI", "REG_T1_ABI", "REG_T2_ABI", 
			"REG_T3_ABI", "REG_T4_ABI", "REG_T5_ABI", "REG_T6_ABI", "REG_T7_ABI", 
			"REG_S0_ABI", "REG_S1_ABI", "REG_S2_ABI", "REG_S3_ABI", "REG_S4_ABI", 
			"REG_S5_ABI", "REG_S6_ABI", "REG_S7_ABI", "REG_T8_ABI", "REG_T9_ABI", 
			"REG_K0_ABI", "REG_K1_ABI", "REG_GP_ABI", "REG_SP_ABI", "REG_FP_ABI", 
			"REG_RA_ABI", "ASTERISK", "PLUS", "MINUS", "PERCENT", "DOT", "DOLLAR", 
			"COLON", "COMMA", "OPENING_BRACKET", "CLOSING_BRACKET", "NUMERIC", "HEX_NUMERIC", 
			"IDENTIFIER", "WS", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
			"NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MIPSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MIPSLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0081\u03f6\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\3\2\3"+
		"\2\7\2\u0138\n\2\f\2\16\2\u013b\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0143"+
		"\n\3\f\3\16\3\u0146\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3"+
		"O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3V\3V\3"+
		"V\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\"+
		"\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a"+
		"\3b\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l"+
		"\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3r\3r"+
		"\3r\3r\3s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\3u\3v\3v\3v\3v\3w\3w\3w\3w\3x"+
		"\3x\3x\3x\3y\3y\3y\3y\3z\3z\3z\3z\3{\3{\3{\3{\3|\3|\3|\3|\3}\3}\3}\3}"+
		"\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0094\5\u0094\u03a7\n\u0094\3\u0094\6\u0094\u03aa\n"+
		"\u0094\r\u0094\16\u0094\u03ab\3\u0095\3\u0095\3\u0095\6\u0095\u03b1\n"+
		"\u0095\r\u0095\16\u0095\u03b2\3\u0096\5\u0096\u03b6\n\u0096\3\u0096\5"+
		"\u0096\u03b9\n\u0096\3\u0096\7\u0096\u03bc\n\u0096\f\u0096\16\u0096\u03bf"+
		"\13\u0096\3\u0096\7\u0096\u03c2\n\u0096\f\u0096\16\u0096\u03c5\13\u0096"+
		"\3\u0096\6\u0096\u03c8\n\u0096\r\u0096\16\u0096\u03c9\3\u0096\5\u0096"+
		"\u03cd\n\u0096\3\u0096\7\u0096\u03d0\n\u0096\f\u0096\16\u0096\u03d3\13"+
		"\u0096\3\u0096\6\u0096\u03d6\n\u0096\r\u0096\16\u0096\u03d7\7\u0096\u03da"+
		"\n\u0096\f\u0096\16\u0096\u03dd\13\u0096\3\u0097\6\u0097\u03e0\n\u0097"+
		"\r\u0097\16\u0097\u03e1\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u03ee\n\u0099\7\u0099\u03f0\n"+
		"\u0099\f\u0099\16\u0099\u03f3\13\u0099\3\u009a\3\u009a\3\u0144\2\u009b"+
		"\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2"+
		"!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\5=\6?\7A\bC\tE\nG\13"+
		"I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35"+
		"m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65"+
		"\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af"+
		"?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3"+
		"I\u00c5J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7"+
		"S\u00d9T\u00dbU\u00ddV\u00dfW\u00e1X\u00e3Y\u00e5Z\u00e7[\u00e9\\\u00eb"+
		"]\u00ed^\u00ef_\u00f1`\u00f3a\u00f5b\u00f7c\u00f9d\u00fbe\u00fdf\u00ff"+
		"g\u0101h\u0103i\u0105j\u0107k\u0109l\u010bm\u010dn\u010fo\u0111p\u0113"+
		"q\u0115r\u0117s\u0119t\u011bu\u011dv\u011fw\u0121x\u0123y\u0125z\u0127"+
		"{\u0129|\u012b}\u012d~\u012f\177\u0131\u0080\u0133\u0081\3\2%\4\2%%=="+
		"\4\2\f\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\3\2\62;\5\2\62;CHch\6\2\62;C\\aac|\4\2C\\c|\5\2\13\13"+
		"\17\17\"\"\6\2\f\f\17\17$$^^\3\2\f\f\2\u03ed\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2"+
		"\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2"+
		"\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2"+
		"\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7"+
		"\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2"+
		"\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9"+
		"\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2"+
		"\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b"+
		"\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2"+
		"\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d"+
		"\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2"+
		"\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f"+
		"\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\3\u0135\3\2\2\2\5\u013e\3\2\2"+
		"\2\7\u014c\3\2\2\2\t\u014e\3\2\2\2\13\u0150\3\2\2\2\r\u0152\3\2\2\2\17"+
		"\u0154\3\2\2\2\21\u0156\3\2\2\2\23\u0158\3\2\2\2\25\u015a\3\2\2\2\27\u015c"+
		"\3\2\2\2\31\u015e\3\2\2\2\33\u0160\3\2\2\2\35\u0162\3\2\2\2\37\u0164\3"+
		"\2\2\2!\u0166\3\2\2\2#\u0168\3\2\2\2%\u016a\3\2\2\2\'\u016c\3\2\2\2)\u016e"+
		"\3\2\2\2+\u0170\3\2\2\2-\u0172\3\2\2\2/\u0174\3\2\2\2\61\u0176\3\2\2\2"+
		"\63\u0178\3\2\2\2\65\u017a\3\2\2\2\67\u017c\3\2\2\29\u017e\3\2\2\2;\u0180"+
		"\3\2\2\2=\u0184\3\2\2\2?\u0188\3\2\2\2A\u0192\3\2\2\2C\u019c\3\2\2\2E"+
		"\u01a7\3\2\2\2G\u01ae\3\2\2\2I\u01b3\3\2\2\2K\u01bb\3\2\2\2M\u01c4\3\2"+
		"\2\2O\u01cb\3\2\2\2Q\u01d3\3\2\2\2S\u01d9\3\2\2\2U\u01df\3\2\2\2W\u01e5"+
		"\3\2\2\2Y\u01eb\3\2\2\2[\u01f2\3\2\2\2]\u01f8\3\2\2\2_\u01fe\3\2\2\2a"+
		"\u0204\3\2\2\2c\u020b\3\2\2\2e\u0211\3\2\2\2g\u0219\3\2\2\2i\u0220\3\2"+
		"\2\2k\u0227\3\2\2\2m\u022f\3\2\2\2o\u0235\3\2\2\2q\u023d\3\2\2\2s\u0245"+
		"\3\2\2\2u\u024b\3\2\2\2w\u0252\3\2\2\2y\u0256\3\2\2\2{\u025b\3\2\2\2}"+
		"\u0261\3\2\2\2\177\u0265\3\2\2\2\u0081\u026a\3\2\2\2\u0083\u0270\3\2\2"+
		"\2\u0085\u0274\3\2\2\2\u0087\u0279\3\2\2\2\u0089\u027d\3\2\2\2\u008b\u0281"+
		"\3\2\2\2\u008d\u0285\3\2\2\2\u008f\u0289\3\2\2\2\u0091\u028d\3\2\2\2\u0093"+
		"\u0292\3\2\2\2\u0095\u0297\3\2\2\2\u0097\u029d\3\2\2\2\u0099\u029f\3\2"+
		"\2\2\u009b\u02a2\3\2\2\2\u009d\u02a6\3\2\2\2\u009f\u02ab\3\2\2\2\u00a1"+
		"\u02ae\3\2\2\2\u00a3\u02b1\3\2\2\2\u00a5\u02b4\3\2\2\2\u00a7\u02b7\3\2"+
		"\2\2\u00a9\u02ba\3\2\2\2\u00ab\u02be\3\2\2\2\u00ad\u02c1\3\2\2\2\u00af"+
		"\u02c5\3\2\2\2\u00b1\u02c9\3\2\2\2\u00b3\u02cc\3\2\2\2\u00b5\u02d0\3\2"+
		"\2\2\u00b7\u02d4\3\2\2\2\u00b9\u02d7\3\2\2\2\u00bb\u02db\3\2\2\2\u00bd"+
		"\u02df\3\2\2\2\u00bf\u02e4\3\2\2\2\u00c1\u02e9\3\2\2\2\u00c3\u02ee\3\2"+
		"\2\2\u00c5\u02f2\3\2\2\2\u00c7\u02f5\3\2\2\2\u00c9\u02f8\3\2\2\2\u00cb"+
		"\u02fb\3\2\2\2\u00cd\u02fe\3\2\2\2\u00cf\u0306\3\2\2\2\u00d1\u030a\3\2"+
		"\2\2\u00d3\u030f\3\2\2\2\u00d5\u0315\3\2\2\2\u00d7\u0319\3\2\2\2\u00d9"+
		"\u031d\3\2\2\2\u00db\u0321\3\2\2\2\u00dd\u0325\3\2\2\2\u00df\u0329\3\2"+
		"\2\2\u00e1\u032d\3\2\2\2\u00e3\u0331\3\2\2\2\u00e5\u0335\3\2\2\2\u00e7"+
		"\u0339\3\2\2\2\u00e9\u033d\3\2\2\2\u00eb\u0341\3\2\2\2\u00ed\u0345\3\2"+
		"\2\2\u00ef\u0349\3\2\2\2\u00f1\u034d\3\2\2\2\u00f3\u0351\3\2\2\2\u00f5"+
		"\u0355\3\2\2\2\u00f7\u0359\3\2\2\2\u00f9\u035d\3\2\2\2\u00fb\u0361\3\2"+
		"\2\2\u00fd\u0365\3\2\2\2\u00ff\u0369\3\2\2\2\u0101\u036d\3\2\2\2\u0103"+
		"\u0371\3\2\2\2\u0105\u0375\3\2\2\2\u0107\u0379\3\2\2\2\u0109\u037d\3\2"+
		"\2\2\u010b\u0381\3\2\2\2\u010d\u0385\3\2\2\2\u010f\u0389\3\2\2\2\u0111"+
		"\u038d\3\2\2\2\u0113\u0391\3\2\2\2\u0115\u0393\3\2\2\2\u0117\u0395\3\2"+
		"\2\2\u0119\u0397\3\2\2\2\u011b\u0399\3\2\2\2\u011d\u039b\3\2\2\2\u011f"+
		"\u039d\3\2\2\2\u0121\u039f\3\2\2\2\u0123\u03a1\3\2\2\2\u0125\u03a3\3\2"+
		"\2\2\u0127\u03a6\3\2\2\2\u0129\u03ad\3\2\2\2\u012b\u03b5\3\2\2\2\u012d"+
		"\u03df\3\2\2\2\u012f\u03e5\3\2\2\2\u0131\u03e8\3\2\2\2\u0133\u03f4\3\2"+
		"\2\2\u0135\u0139\t\2\2\2\u0136\u0138\n\3\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\b\2\2\2\u013d\4\3\2\2\2\u013e\u013f"+
		"\7\61\2\2\u013f\u0140\7,\2\2\u0140\u0144\3\2\2\2\u0141\u0143\13\2\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7,\2\2\u0148"+
		"\u0149\7\61\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\3\3\2\u014b\6\3\2\2"+
		"\2\u014c\u014d\t\4\2\2\u014d\b\3\2\2\2\u014e\u014f\t\5\2\2\u014f\n\3\2"+
		"\2\2\u0150\u0151\t\6\2\2\u0151\f\3\2\2\2\u0152\u0153\t\7\2\2\u0153\16"+
		"\3\2\2\2\u0154\u0155\t\b\2\2\u0155\20\3\2\2\2\u0156\u0157\t\t\2\2\u0157"+
		"\22\3\2\2\2\u0158\u0159\t\n\2\2\u0159\24\3\2\2\2\u015a\u015b\t\13\2\2"+
		"\u015b\26\3\2\2\2\u015c\u015d\t\f\2\2\u015d\30\3\2\2\2\u015e\u015f\t\r"+
		"\2\2\u015f\32\3\2\2\2\u0160\u0161\t\16\2\2\u0161\34\3\2\2\2\u0162\u0163"+
		"\t\17\2\2\u0163\36\3\2\2\2\u0164\u0165\t\20\2\2\u0165 \3\2\2\2\u0166\u0167"+
		"\t\21\2\2\u0167\"\3\2\2\2\u0168\u0169\t\22\2\2\u0169$\3\2\2\2\u016a\u016b"+
		"\t\23\2\2\u016b&\3\2\2\2\u016c\u016d\t\24\2\2\u016d(\3\2\2\2\u016e\u016f"+
		"\t\25\2\2\u016f*\3\2\2\2\u0170\u0171\t\26\2\2\u0171,\3\2\2\2\u0172\u0173"+
		"\t\27\2\2\u0173.\3\2\2\2\u0174\u0175\t\30\2\2\u0175\60\3\2\2\2\u0176\u0177"+
		"\t\31\2\2\u0177\62\3\2\2\2\u0178\u0179\t\32\2\2\u0179\64\3\2\2\2\u017a"+
		"\u017b\t\33\2\2\u017b\66\3\2\2\2\u017c\u017d\t\34\2\2\u017d8\3\2\2\2\u017e"+
		"\u017f\t\35\2\2\u017f:\3\2\2\2\u0180\u0181\7\'\2\2\u0181\u0182\5\25\13"+
		"\2\u0182\u0183\5\27\f\2\u0183<\3\2\2\2\u0184\u0185\7\'\2\2\u0185\u0186"+
		"\5\35\17\2\u0186\u0187\5#\22\2\u0187>\3\2\2\2\u0188\u0189\7\'\2\2\u0189"+
		"\u018a\5%\23\2\u018a\u018b\5\13\6\2\u018b\u018c\5)\25\2\u018c\u018d\5"+
		"\17\b\2\u018d\u018e\5\35\17\2\u018e\u018f\7a\2\2\u018f\u0190\5\25\13\2"+
		"\u0190\u0191\5\27\f\2\u0191@\3\2\2\2\u0192\u0193\7\'\2\2\u0193\u0194\5"+
		"%\23\2\u0194\u0195\5\13\6\2\u0195\u0196\5)\25\2\u0196\u0197\5\17\b\2\u0197"+
		"\u0198\5\35\17\2\u0198\u0199\7a\2\2\u0199\u019a\5\35\17\2\u019a\u019b"+
		"\5#\22\2\u019bB\3\2\2\2\u019c\u019d\5\u011b\u008e\2\u019d\u019e\5\7\4"+
		"\2\u019e\u019f\5-\27\2\u019f\u01a0\5-\27\2\u01a0\u01a1\5)\25\2\u01a1\u01a2"+
		"\5\27\f\2\u01a2\u01a3\5\t\5\2\u01a3\u01a4\5/\30\2\u01a4\u01a5\5-\27\2"+
		"\u01a5\u01a6\5\17\b\2\u01a6D\3\2\2\2\u01a7\u01a8\5\u011b\u008e\2\u01a8"+
		"\u01a9\5\7\4\2\u01a9\u01aa\5\35\17\2\u01aa\u01ab\5\27\f\2\u01ab\u01ac"+
		"\5\23\n\2\u01ac\u01ad\5!\21\2\u01adF\3\2\2\2\u01ae\u01af\5\u011b\u008e"+
		"\2\u01af\u01b0\5\17\b\2\u01b0\u01b1\5\'\24\2\u01b1\u01b2\5/\30\2\u01b2"+
		"H\3\2\2\2\u01b3\u01b4\5\u011b\u008e\2\u01b4\u01b5\5\17\b\2\u01b5\u01b6"+
		"\5\65\33\2\u01b6\u01b7\5-\27\2\u01b7\u01b8\5\17\b\2\u01b8\u01b9\5)\25"+
		"\2\u01b9\u01ba\5!\21\2\u01baJ\3\2\2\2\u01bb\u01bc\5\u011b\u008e\2\u01bc"+
		"\u01bd\5+\26\2\u01bd\u01be\5\17\b\2\u01be\u01bf\5\13\6\2\u01bf\u01c0\5"+
		"-\27\2\u01c0\u01c1\5\27\f\2\u01c1\u01c2\5#\22\2\u01c2\u01c3\5!\21\2\u01c3"+
		"L\3\2\2\2\u01c4\u01c5\5\u011b\u008e\2\u01c5\u01c6\5\23\n\2\u01c6\u01c7"+
		"\5\35\17\2\u01c7\u01c8\5#\22\2\u01c8\u01c9\5\t\5\2\u01c9\u01ca\5\35\17"+
		"\2\u01caN\3\2\2\2\u01cb\u01cc\5\u011b\u008e\2\u01cc\u01cd\5\23\n\2\u01cd"+
		"\u01ce\5\35\17\2\u01ce\u01cf\5#\22\2\u01cf\u01d0\5\t\5\2\u01d0\u01d1\5"+
		"\7\4\2\u01d1\u01d2\5\35\17\2\u01d2P\3\2\2\2\u01d3\u01d4\5\u011b\u008e"+
		"\2\u01d4\u01d5\5-\27\2\u01d5\u01d6\5\17\b\2\u01d6\u01d7\5\65\33\2\u01d7"+
		"\u01d8\5-\27\2\u01d8R\3\2\2\2\u01d9\u01da\5\u011b\u008e\2\u01da\u01db"+
		"\5-\27\2\u01db\u01dc\5\67\34\2\u01dc\u01dd\5%\23\2\u01dd\u01de\5\17\b"+
		"\2\u01deT\3\2\2\2\u01df\u01e0\5\u011b\u008e\2\u01e0\u01e1\5\r\7\2\u01e1"+
		"\u01e2\5\7\4\2\u01e2\u01e3\5-\27\2\u01e3\u01e4\5\7\4\2\u01e4V\3\2\2\2"+
		"\u01e5\u01e6\5\u011b\u008e\2\u01e6\u01e7\5\t\5\2\u01e7\u01e8\5\67\34\2"+
		"\u01e8\u01e9\5-\27\2\u01e9\u01ea\5\17\b\2\u01eaX\3\2\2\2\u01eb\u01ec\5"+
		"\u011b\u008e\2\u01ec\u01ed\5+\26\2\u01ed\u01ee\5%\23\2\u01ee\u01ef\5\7"+
		"\4\2\u01ef\u01f0\5\13\6\2\u01f0\u01f1\5\17\b\2\u01f1Z\3\2\2\2\u01f2\u01f3"+
		"\5\u011b\u008e\2\u01f3\u01f4\5\25\13\2\u01f4\u01f5\5\7\4\2\u01f5\u01f6"+
		"\5\35\17\2\u01f6\u01f7\5\21\t\2\u01f7\\\3\2\2\2\u01f8\u01f9\5\u011b\u008e"+
		"\2\u01f9\u01fa\5\63\32\2\u01fa\u01fb\5\17\b\2\u01fb\u01fc\5\7\4\2\u01fc"+
		"\u01fd\5\33\16\2\u01fd^\3\2\2\2\u01fe\u01ff\5\u011b\u008e\2\u01ff\u0200"+
		"\5\63\32\2\u0200\u0201\5#\22\2\u0201\u0202\5)\25\2\u0202\u0203\5\r\7\2"+
		"\u0203`\3\2\2\2\u0204\u0205\5\u011b\u008e\2\u0205\u0206\5\r\7\2\u0206"+
		"\u0207\5\63\32\2\u0207\u0208\5#\22\2\u0208\u0209\5)\25\2\u0209\u020a\5"+
		"\r\7\2\u020ab\3\2\2\2\u020b\u020c\5\u011b\u008e\2\u020c\u020d\5\21\t\2"+
		"\u020d\u020e\5\27\f\2\u020e\u020f\5\35\17\2\u020f\u0210\5\17\b\2\u0210"+
		"d\3\2\2\2\u0211\u0212\5\u011b\u008e\2\u0212\u0213\5)\25\2\u0213\u0214"+
		"\5#\22\2\u0214\u0215\5\r\7\2\u0215\u0216\5\7\4\2\u0216\u0217\5-\27\2\u0217"+
		"\u0218\5\7\4\2\u0218f\3\2\2\2\u0219\u021a\5\u011b\u008e\2\u021a\u021b"+
		"\5\7\4\2\u021b\u021c\5+\26\2\u021c\u021d\5\13\6\2\u021d\u021e\5\27\f\2"+
		"\u021e\u021f\5\27\f\2\u021fh\3\2\2\2\u0220\u0221\5\u011b\u008e\2\u0221"+
		"\u0222\5\7\4\2\u0222\u0223\5+\26\2\u0223\u0224\5\13\6\2\u0224\u0225\5"+
		"\27\f\2\u0225\u0226\59\35\2\u0226j\3\2\2\2\u0227\u0228\5\u011b\u008e\2"+
		"\u0228\u0229\5\7\4\2\u0229\u022a\5+\26\2\u022a\u022b\5\13\6\2\u022b\u022c"+
		"\5\27\f\2\u022c\u022d\5\27\f\2\u022d\u022e\59\35\2\u022el\3\2\2\2\u022f"+
		"\u0230\5\u011b\u008e\2\u0230\u0231\5+\26\2\u0231\u0232\5\33\16\2\u0232"+
		"\u0233\5\27\f\2\u0233\u0234\5%\23\2\u0234n\3\2\2\2\u0235\u0236\5\u011b"+
		"\u008e\2\u0236\u0237\5+\26\2\u0237\u0238\5-\27\2\u0238\u0239\5)\25\2\u0239"+
		"\u023a\5\27\f\2\u023a\u023b\5!\21\2\u023b\u023c\5\23\n\2\u023cp\3\2\2"+
		"\2\u023d\u023e\5\u011b\u008e\2\u023e\u023f\5#\22\2\u023f\u0240\5%\23\2"+
		"\u0240\u0241\5-\27\2\u0241\u0242\5\27\f\2\u0242\u0243\5#\22\2\u0243\u0244"+
		"\5!\21\2\u0244r\3\2\2\2\u0245\u0246\5\u011b\u008e\2\u0246\u0247\5+\26"+
		"\2\u0247\u0248\5\27\f\2\u0248\u0249\59\35\2\u0249\u024a\5\17\b\2\u024a"+
		"t\3\2\2\2\u024b\u024c\5\u011b\u008e\2\u024c\u024d\5\27\f\2\u024d\u024e"+
		"\5\r\7\2\u024e\u024f\5\17\b\2\u024f\u0250\5!\21\2\u0250\u0251\5-\27\2"+
		"\u0251v\3\2\2\2\u0252\u0253\5\7\4\2\u0253\u0254\5\r\7\2\u0254\u0255\5"+
		"\r\7\2\u0255x\3\2\2\2\u0256\u0257\5\7\4\2\u0257\u0258\5\r\7\2\u0258\u0259"+
		"\5\r\7\2\u0259\u025a\5\27\f\2\u025az\3\2\2\2\u025b\u025c\5\7\4\2\u025c"+
		"\u025d\5\r\7\2\u025d\u025e\5\r\7\2\u025e\u025f\5\27\f\2\u025f\u0260\5"+
		"/\30\2\u0260|\3\2\2\2\u0261\u0262\5\7\4\2\u0262\u0263\5!\21\2\u0263\u0264"+
		"\5\r\7\2\u0264~\3\2\2\2\u0265\u0266\5\7\4\2\u0266\u0267\5!\21\2\u0267"+
		"\u0268\5\r\7\2\u0268\u0269\5\27\f\2\u0269\u0080\3\2\2\2\u026a\u026b\5"+
		"\7\4\2\u026b\u026c\5/\30\2\u026c\u026d\5\27\f\2\u026d\u026e\5%\23\2\u026e"+
		"\u026f\5\13\6\2\u026f\u0082\3\2\2\2\u0270\u0271\5\t\5\2\u0271\u0272\5"+
		"\17\b\2\u0272\u0273\5\'\24\2\u0273\u0084\3\2\2\2\u0274\u0275\5\t\5\2\u0275"+
		"\u0276\5\17\b\2\u0276\u0277\5\'\24\2\u0277\u0278\59\35\2\u0278\u0086\3"+
		"\2\2\2\u0279\u027a\5\t\5\2\u027a\u027b\5\23\n\2\u027b\u027c\5\17\b\2\u027c"+
		"\u0088\3\2\2\2\u027d\u027e\5\t\5\2\u027e\u027f\5\23\n\2\u027f\u0280\5"+
		"-\27\2\u0280\u008a\3\2\2\2\u0281\u0282\5\t\5\2\u0282\u0283\5\35\17\2\u0283"+
		"\u0284\5-\27\2\u0284\u008c\3\2\2\2\u0285\u0286\5\t\5\2\u0286\u0287\5\35"+
		"\17\2\u0287\u0288\5\17\b\2\u0288\u008e\3\2\2\2\u0289\u028a\5\t\5\2\u028a"+
		"\u028b\5!\21\2\u028b\u028c\5\17\b\2\u028c\u0090\3\2\2\2\u028d\u028e\5"+
		"\t\5\2\u028e\u028f\5!\21\2\u028f\u0290\5\17\b\2\u0290\u0291\59\35\2\u0291"+
		"\u0092\3\2\2\2\u0292\u0293\5\13\6\2\u0293\u0294\5\7\4\2\u0294\u0295\5"+
		"\35\17\2\u0295\u0296\5\35\17\2\u0296\u0094\3\2\2\2\u0297\u0298\5\17\b"+
		"\2\u0298\u0299\5\13\6\2\u0299\u029a\5\7\4\2\u029a\u029b\5\35\17\2\u029b"+
		"\u029c\5\35\17\2\u029c\u0096\3\2\2\2\u029d\u029e\5\31\r\2\u029e\u0098"+
		"\3\2\2\2\u029f\u02a0\5\31\r\2\u02a0\u02a1\5)\25\2\u02a1\u009a\3\2\2\2"+
		"\u02a2\u02a3\5\31\r\2\u02a3\u02a4\5\7\4\2\u02a4\u02a5\5\35\17\2\u02a5"+
		"\u009c\3\2\2\2\u02a6\u02a7\5\31\r\2\u02a7\u02a8\5\7\4\2\u02a8\u02a9\5"+
		"\35\17\2\u02a9\u02aa\5)\25\2\u02aa\u009e\3\2\2\2\u02ab\u02ac\5\35\17\2"+
		"\u02ac\u02ad\5\7\4\2\u02ad\u00a0\3\2\2\2\u02ae\u02af\5\35\17\2\u02af\u02b0"+
		"\5\r\7\2\u02b0\u00a2\3\2\2\2\u02b1\u02b2\5\35\17\2\u02b2\u02b3\5\63\32"+
		"\2\u02b3\u00a4\3\2\2\2\u02b4\u02b5\5\35\17\2\u02b5\u02b6\5\25\13\2\u02b6"+
		"\u00a6\3\2\2\2\u02b7\u02b8\5\35\17\2\u02b8\u02b9\5\t\5\2\u02b9\u00a8\3"+
		"\2\2\2\u02ba\u02bb\5\35\17\2\u02bb\u02bc\5\t\5\2\u02bc\u02bd\5/\30\2\u02bd"+
		"\u00aa\3\2\2\2\u02be\u02bf\5\35\17\2\u02bf\u02c0\5\27\f\2\u02c0\u00ac"+
		"\3\2\2\2\u02c1\u02c2\5\35\17\2\u02c2\u02c3\5/\30\2\u02c3\u02c4\5\27\f"+
		"\2\u02c4\u00ae\3\2\2\2\u02c5\u02c6\5\37\20\2\u02c6\u02c7\5/\30\2\u02c7"+
		"\u02c8\5\35\17\2\u02c8\u00b0\3\2\2\2\u02c9\u02ca\5\37\20\2\u02ca\u02cb"+
		"\5\61\31\2\u02cb\u00b2\3\2\2\2\u02cc\u02cd\5!\21\2\u02cd\u02ce\5#\22\2"+
		"\u02ce\u02cf\5%\23\2\u02cf\u00b4\3\2\2\2\u02d0\u02d1\5!\21\2\u02d1\u02d2"+
		"\5#\22\2\u02d2\u02d3\5-\27\2\u02d3\u00b6\3\2\2\2\u02d4\u02d5\5#\22\2\u02d5"+
		"\u02d6\5)\25\2\u02d6\u00b8\3\2\2\2\u02d7\u02d8\5)\25\2\u02d8\u02d9\5\17"+
		"\b\2\u02d9\u02da\5-\27\2\u02da\u00ba\3\2\2\2\u02db\u02dc\5+\26\2\u02dc"+
		"\u02dd\5\35\17\2\u02dd\u02de\5-\27\2\u02de\u00bc\3\2\2\2\u02df\u02e0\5"+
		"+\26\2\u02e0\u02e1\5)\25\2\u02e1\u02e2\5\7\4\2\u02e2\u02e3\5\27\f\2\u02e3"+
		"\u00be\3\2\2\2\u02e4\u02e5\5+\26\2\u02e5\u02e6\5)\25\2\u02e6\u02e7\5\35"+
		"\17\2\u02e7\u02e8\5\27\f\2\u02e8\u00c0\3\2\2\2\u02e9\u02ea\5+\26\2\u02ea"+
		"\u02eb\5\35\17\2\u02eb\u02ec\5\35\17\2\u02ec\u02ed\5\27\f\2\u02ed\u00c2"+
		"\3\2\2\2\u02ee\u02ef\5+\26\2\u02ef\u02f0\5/\30\2\u02f0\u02f1\5\t\5\2\u02f1"+
		"\u00c4\3\2\2\2\u02f2\u02f3\5+\26\2\u02f3\u02f4\5\r\7\2\u02f4\u00c6\3\2"+
		"\2\2\u02f5\u02f6\5+\26\2\u02f6\u02f7\5\63\32\2\u02f7\u00c8\3\2\2\2\u02f8"+
		"\u02f9\5+\26\2\u02f9\u02fa\5\25\13\2\u02fa\u00ca\3\2\2\2\u02fb\u02fc\5"+
		"+\26\2\u02fc\u02fd\5\t\5\2\u02fd\u00cc\3\2\2\2\u02fe\u02ff\5+\26\2\u02ff"+
		"\u0300\5\67\34\2\u0300\u0301\5+\26\2\u0301\u0302\5\13\6\2\u0302\u0303"+
		"\5\7\4\2\u0303\u0304\5\35\17\2\u0304\u0305\5\35\17\2\u0305\u00ce\3\2\2"+
		"\2\u0306\u0307\5\63\32\2\u0307\u0308\5\21\t\2\u0308\u0309\5\27\f\2\u0309"+
		"\u00d0\3\2\2\2\u030a\u030b\5\65\33\2\u030b\u030c\5#\22\2\u030c\u030d\5"+
		")\25\2\u030d\u030e\5\27\f\2\u030e\u00d2\3\2\2\2\u030f\u0310\5\u011d\u008f"+
		"\2\u0310\u0311\59\35\2\u0311\u0312\5\17\b\2\u0312\u0313\5)\25\2\u0313"+
		"\u0314\5#\22\2\u0314\u00d4\3\2\2\2\u0315\u0316\5\u011d\u008f\2\u0316\u0317"+
		"\5\7\4\2\u0317\u0318\5-\27\2\u0318\u00d6\3\2\2\2\u0319\u031a\5\u011d\u008f"+
		"\2\u031a\u031b\5\61\31\2\u031b\u031c\7\62\2\2\u031c\u00d8\3\2\2\2\u031d"+
		"\u031e\5\u011d\u008f\2\u031e\u031f\5\61\31\2\u031f\u0320\7\63\2\2\u0320"+
		"\u00da\3\2\2\2\u0321\u0322\5\u011d\u008f\2\u0322\u0323\5\7\4\2\u0323\u0324"+
		"\7\62\2\2\u0324\u00dc\3\2\2\2\u0325\u0326\5\u011d\u008f\2\u0326\u0327"+
		"\5\7\4\2\u0327\u0328\7\63\2\2\u0328\u00de\3\2\2\2\u0329\u032a\5\u011d"+
		"\u008f\2\u032a\u032b\5\7\4\2\u032b\u032c\7\64\2\2\u032c\u00e0\3\2\2\2"+
		"\u032d\u032e\5\u011d\u008f\2\u032e\u032f\5\7\4\2\u032f\u0330\7\65\2\2"+
		"\u0330\u00e2\3\2\2\2\u0331\u0332\5\u011d\u008f\2\u0332\u0333\5-\27\2\u0333"+
		"\u0334\7\62\2\2\u0334\u00e4\3\2\2\2\u0335\u0336\5\u011d\u008f\2\u0336"+
		"\u0337\5-\27\2\u0337\u0338\7\63\2\2\u0338\u00e6\3\2\2\2\u0339\u033a\5"+
		"\u011d\u008f\2\u033a\u033b\5-\27\2\u033b\u033c\7\64\2\2\u033c\u00e8\3"+
		"\2\2\2\u033d\u033e\5\u011d\u008f\2\u033e\u033f\5-\27\2\u033f\u0340\7\65"+
		"\2\2\u0340\u00ea\3\2\2\2\u0341\u0342\5\u011d\u008f\2\u0342\u0343\5-\27"+
		"\2\u0343\u0344\7\66\2\2\u0344\u00ec\3\2\2\2\u0345\u0346\5\u011d\u008f"+
		"\2\u0346\u0347\5-\27\2\u0347\u0348\7\67\2\2\u0348\u00ee\3\2\2\2\u0349"+
		"\u034a\5\u011d\u008f\2\u034a\u034b\5-\27\2\u034b\u034c\78\2\2\u034c\u00f0"+
		"\3\2\2\2\u034d\u034e\5\u011d\u008f\2\u034e\u034f\5-\27\2\u034f\u0350\7"+
		"9\2\2\u0350\u00f2\3\2\2\2\u0351\u0352\5\u011d\u008f\2\u0352\u0353\5+\26"+
		"\2\u0353\u0354\7\62\2\2\u0354\u00f4\3\2\2\2\u0355\u0356\5\u011d\u008f"+
		"\2\u0356\u0357\5+\26\2\u0357\u0358\7\63\2\2\u0358\u00f6\3\2\2\2\u0359"+
		"\u035a\5\u011d\u008f\2\u035a\u035b\5+\26\2\u035b\u035c\7\64\2\2\u035c"+
		"\u00f8\3\2\2\2\u035d\u035e\5\u011d\u008f\2\u035e\u035f\5+\26\2\u035f\u0360"+
		"\7\65\2\2\u0360\u00fa\3\2\2\2\u0361\u0362\5\u011d\u008f\2\u0362\u0363"+
		"\5+\26\2\u0363\u0364\7\66\2\2\u0364\u00fc\3\2\2\2\u0365\u0366\5\u011d"+
		"\u008f\2\u0366\u0367\5+\26\2\u0367\u0368\7\67\2\2\u0368\u00fe\3\2\2\2"+
		"\u0369\u036a\5\u011d\u008f\2\u036a\u036b\5+\26\2\u036b\u036c\78\2\2\u036c"+
		"\u0100\3\2\2\2\u036d\u036e\5\u011d\u008f\2\u036e\u036f\5+\26\2\u036f\u0370"+
		"\79\2\2\u0370\u0102\3\2\2\2\u0371\u0372\5\u011d\u008f\2\u0372\u0373\5"+
		"-\27\2\u0373\u0374\7:\2\2\u0374\u0104\3\2\2\2\u0375\u0376\5\u011d\u008f"+
		"\2\u0376\u0377\5-\27\2\u0377\u0378\7;\2\2\u0378\u0106\3\2\2\2\u0379\u037a"+
		"\5\u011d\u008f\2\u037a\u037b\5\33\16\2\u037b\u037c\7\62\2\2\u037c\u0108"+
		"\3\2\2\2\u037d\u037e\5\u011d\u008f\2\u037e\u037f\5\33\16\2\u037f\u0380"+
		"\7\63\2\2\u0380\u010a\3\2\2\2\u0381\u0382\5\u011d\u008f\2\u0382\u0383"+
		"\5\23\n\2\u0383\u0384\5%\23\2\u0384\u010c\3\2\2\2\u0385\u0386\5\u011d"+
		"\u008f\2\u0386\u0387\5+\26\2\u0387\u0388\5%\23\2\u0388\u010e\3\2\2\2\u0389"+
		"\u038a\5\u011d\u008f\2\u038a\u038b\5\21\t\2\u038b\u038c\5%\23\2\u038c"+
		"\u0110\3\2\2\2\u038d\u038e\5\u011d\u008f\2\u038e\u038f\5)\25\2\u038f\u0390"+
		"\5\7\4\2\u0390\u0112\3\2\2\2\u0391\u0392\7,\2\2\u0392\u0114\3\2\2\2\u0393"+
		"\u0394\7-\2\2\u0394\u0116\3\2\2\2\u0395\u0396\7/\2\2\u0396\u0118\3\2\2"+
		"\2\u0397\u0398\7\'\2\2\u0398\u011a\3\2\2\2\u0399\u039a\7\60\2\2\u039a"+
		"\u011c\3\2\2\2\u039b\u039c\7&\2\2\u039c\u011e\3\2\2\2\u039d\u039e\7<\2"+
		"\2\u039e\u0120\3\2\2\2\u039f\u03a0\7.\2\2\u03a0\u0122\3\2\2\2\u03a1\u03a2"+
		"\7*\2\2\u03a2\u0124\3\2\2\2\u03a3\u03a4\7+\2\2\u03a4\u0126\3\2\2\2\u03a5"+
		"\u03a7\7/\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2"+
		"\2\2\u03a8\u03aa\t\36\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u0128\3\2\2\2\u03ad\u03ae\7\62"+
		"\2\2\u03ae\u03b0\7z\2\2\u03af\u03b1\t\37\2\2\u03b0\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u012a\3\2"+
		"\2\2\u03b4\u03b6\7B\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b8\3\2\2\2\u03b7\u03b9\5\u011b\u008e\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03bd\3\2\2\2\u03ba\u03bc\7a\2\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c3\3\2"+
		"\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c2\t \2\2\u03c1\u03c0\3\2\2\2\u03c2"+
		"\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c7\3\2"+
		"\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c8\t!\2\2\u03c7\u03c6\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03db\3\2"+
		"\2\2\u03cb\u03cd\5\u011b\u008e\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2"+
		"\2\u03cd\u03d1\3\2\2\2\u03ce\u03d0\7a\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3"+
		"\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d6\t \2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03cc\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u012c\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0\t\"\2\2\u03df"+
		"\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\b\u0097\3\2\u03e4\u012e\3\2\2\2\u03e5"+
		"\u03e6\5\u0131\u0099\2\u03e6\u03e7\7$\2\2\u03e7\u0130\3\2\2\2\u03e8\u03f1"+
		"\7$\2\2\u03e9\u03f0\n#\2\2\u03ea\u03ed\7^\2\2\u03eb\u03ee\13\2\2\2\u03ec"+
		"\u03ee\7\2\2\3\u03ed\u03eb\3\2\2\2\u03ed\u03ec\3\2\2\2\u03ee\u03f0\3\2"+
		"\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03ea\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0132\3\2\2\2\u03f3\u03f1\3\2"+
		"\2\2\u03f4\u03f5\t$\2\2\u03f5\u0134\3\2\2\2\25\2\u0139\u0144\u03a6\u03ab"+
		"\u03b2\u03b5\u03b8\u03bd\u03c3\u03c9\u03cc\u03d1\u03d7\u03db\u03e1\u03ed"+
		"\u03ef\u03f1\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}