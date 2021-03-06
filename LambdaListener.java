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
	/**
	 * Enter a parse tree produced by {@link LambdaParser#applicationLambdas}.
	 * @param ctx the parse tree
	 */
	void enterApplicationLambdas(LambdaParser.ApplicationLambdasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#applicationLambdas}.
	 * @param ctx the parse tree
	 */
	void exitApplicationLambdas(LambdaParser.ApplicationLambdasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(LambdaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(LambdaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(LambdaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(LambdaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(LambdaParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(LambdaParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#bindings}.
	 * @param ctx the parse tree
	 */
	void enterBindings(LambdaParser.BindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#bindings}.
	 * @param ctx the parse tree
	 */
	void exitBindings(LambdaParser.BindingsContext ctx);
}