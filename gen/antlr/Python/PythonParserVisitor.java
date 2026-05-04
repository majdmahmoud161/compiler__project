// Generated from C:/Projects/compiler__project/src/antlr/Python/PythonParser.g4 by ANTLR 4.13.2
package antlr.Python;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#programe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograme(PythonParser.ProgrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarLable(PythonParser.VarLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLable(PythonParser.ArrayLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopLable(PythonParser.LoopLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLable(PythonParser.IfLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclerLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclerLable(PythonParser.FunctionDeclerLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunctionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionLable(PythonParser.CallFunctionLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclLabel(PythonParser.ClassDeclLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLabel(PythonParser.ObjectLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFromClassLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFromClassLabel(PythonParser.CallFromClassLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InheritanceLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceLabel(PythonParser.InheritanceLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#vardecler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecler(PythonParser.VardeclerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PythonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLable(PythonParser.ForLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLable(PythonParser.WhileLableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(PythonParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PythonParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(PythonParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#el_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl_if(PythonParser.El_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(PythonParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#function_decler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decler(PythonParser.Function_declerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(PythonParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#build_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_in_function(PythonParser.Build_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PythonParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructerDeclerLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructerDeclerLabel(PythonParser.ConstructerDeclerLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EncapsulationLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulationLabel(PythonParser.EncapsulationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateLabel(PythonParser.StateLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorLabel(PythonParser.DecoratorLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#constructor_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_decl(PythonParser.Constructor_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(PythonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#super}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper(PythonParser.SuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamterlist(PythonParser.ParamterlistContext ctx);
}