// Generated from Lambda.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#lambdaStart}.
	 * @param ctx the parse tree
	 */
	void enterLambdaStart(LambdaParser.LambdaStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#lambdaStart}.
	 * @param ctx the parse tree
	 */
	void exitLambdaStart(LambdaParser.LambdaStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#atomicLambda}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLambda(LambdaParser.AtomicLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#atomicLambda}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLambda(LambdaParser.AtomicLambdaContext ctx);
}