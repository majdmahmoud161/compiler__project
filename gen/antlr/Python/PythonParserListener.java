// Generated from C:/Projects/compiler__project/src/antlr/Python/PythonParser.g4 by ANTLR 4.13.2
package antlr.Python;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#programe}.
	 * @param ctx the parse tree
	 */
	void enterPrograme(PythonParser.ProgrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#programe}.
	 * @param ctx the parse tree
	 */
	void exitPrograme(PythonParser.ProgrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterVarLable(PythonParser.VarLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitVarLable(PythonParser.VarLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterArrayLable(PythonParser.ArrayLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitArrayLable(PythonParser.ArrayLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterLoopLable(PythonParser.LoopLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitLoopLable(PythonParser.LoopLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterIfLable(PythonParser.IfLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitIfLable(PythonParser.IfLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclerLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclerLable(PythonParser.FunctionDeclerLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclerLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclerLable(PythonParser.FunctionDeclerLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunctionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionLable(PythonParser.CallFunctionLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunctionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionLable(PythonParser.CallFunctionLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclLabel(PythonParser.ClassDeclLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclLabel(PythonParser.ClassDeclLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterObjectLabel(PythonParser.ObjectLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitObjectLabel(PythonParser.ObjectLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFromClassLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterCallFromClassLabel(PythonParser.CallFromClassLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFromClassLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitCallFromClassLabel(PythonParser.CallFromClassLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InheritanceLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceLabel(PythonParser.InheritanceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InheritanceLabel}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceLabel(PythonParser.InheritanceLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#vardecler}.
	 * @param ctx the parse tree
	 */
	void enterVardecler(PythonParser.VardeclerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#vardecler}.
	 * @param ctx the parse tree
	 */
	void exitVardecler(PythonParser.VardeclerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PythonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PythonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterForLable(PythonParser.ForLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitForLable(PythonParser.ForLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLable(PythonParser.WhileLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLable}
	 * labeled alternative in {@link PythonParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLable(PythonParser.WhileLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(PythonParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(PythonParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(PythonParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(PythonParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(PythonParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(PythonParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#el_if}.
	 * @param ctx the parse tree
	 */
	void enterEl_if(PythonParser.El_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#el_if}.
	 * @param ctx the parse tree
	 */
	void exitEl_if(PythonParser.El_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(PythonParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(PythonParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#function_decler}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decler(PythonParser.Function_declerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#function_decler}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decler(PythonParser.Function_declerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(PythonParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(PythonParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#build_in_function}.
	 * @param ctx the parse tree
	 */
	void enterBuild_in_function(PythonParser.Build_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#build_in_function}.
	 * @param ctx the parse tree
	 */
	void exitBuild_in_function(PythonParser.Build_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(PythonParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PythonParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PythonParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructerDeclerLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructerDeclerLabel(PythonParser.ConstructerDeclerLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructerDeclerLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructerDeclerLabel(PythonParser.ConstructerDeclerLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EncapsulationLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulationLabel(PythonParser.EncapsulationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EncapsulationLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulationLabel(PythonParser.EncapsulationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterStateLabel(PythonParser.StateLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitStateLabel(PythonParser.StateLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorLabel(PythonParser.DecoratorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorLabel}
	 * labeled alternative in {@link PythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorLabel(PythonParser.DecoratorLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#constructor_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_decl(PythonParser.Constructor_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#constructor_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_decl(PythonParser.Constructor_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(PythonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(PythonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 */
	void enterCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 */
	void exitCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#super}.
	 * @param ctx the parse tree
	 */
	void enterSuper(PythonParser.SuperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#super}.
	 * @param ctx the parse tree
	 */
	void exitSuper(PythonParser.SuperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramterlist}.
	 * @param ctx the parse tree
	 */
	void enterParamterlist(PythonParser.ParamterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramterlist}.
	 * @param ctx the parse tree
	 */
	void exitParamterlist(PythonParser.ParamterlistContext ctx);
}