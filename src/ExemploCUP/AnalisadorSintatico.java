
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ExemploCUP;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalisadorSintatico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Sym.class;
}

  /** Default constructor. */
  @Deprecated
  public AnalisadorSintatico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public AnalisadorSintatico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalisadorSintatico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\011\007\000" +
    "\002\016\003\000\002\016\003\000\002\016\003\000\002" +
    "\005\011\000\002\006\005\000\002\007\003\000\002\007" +
    "\003\000\002\010\005\000\002\012\006\000\002\013\005" +
    "\000\002\014\003\000\002\014\005\000\002\015\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\004\006\005\001\002\000\004\002\063\001" +
    "\002\000\004\007\006\001\002\000\010\004\017\020\014" +
    "\021\013\001\002\000\012\004\ufffa\010\ufffa\020\ufffa\021" +
    "\ufffa\001\002\000\012\004\ufffb\010\ufffb\020\ufffb\021\ufffb" +
    "\001\002\000\012\004\017\010\ufffe\020\014\021\013\001" +
    "\002\000\012\004\ufffc\010\ufffc\020\ufffc\021\ufffc\001\002" +
    "\000\006\016\040\021\037\001\002\000\004\021\030\001" +
    "\002\000\012\004\ufffd\010\ufffd\020\ufffd\021\ufffd\001\002" +
    "\000\004\010\027\001\002\000\004\014\020\001\002\000" +
    "\010\021\022\022\023\023\021\001\002\000\012\011\ufff6" +
    "\015\ufff6\016\ufff6\017\ufff6\001\002\000\012\011\ufff8\015" +
    "\ufff8\016\ufff8\017\ufff8\001\002\000\012\011\ufff7\015\ufff7" +
    "\016\ufff7\017\ufff7\001\002\000\004\015\025\001\002\000" +
    "\004\011\026\001\002\000\012\004\ufff9\010\ufff9\020\ufff9" +
    "\021\ufff9\001\002\000\004\002\000\001\002\000\006\011" +
    "\034\013\032\001\002\000\012\004\ufff2\010\ufff2\020\ufff2" +
    "\021\ufff2\001\002\000\004\021\035\001\002\000\012\004" +
    "\ufff4\010\ufff4\020\ufff4\021\ufff4\001\002\000\012\004\ufff3" +
    "\010\ufff3\020\ufff3\021\ufff3\001\002\000\006\011\034\013" +
    "\032\001\002\000\012\004\ufff1\010\ufff1\020\ufff1\021\ufff1" +
    "\001\002\000\004\016\055\001\002\000\010\021\022\022" +
    "\023\023\021\001\002\000\004\011\054\001\002\000\004" +
    "\016\043\001\002\000\012\011\045\021\022\022\023\023" +
    "\021\001\002\000\004\017\047\001\002\000\004\011\uffee" +
    "\001\002\000\004\011\uffef\001\002\000\010\021\022\022" +
    "\023\023\021\001\002\000\004\011\uffed\001\002\000\004" +
    "\011\052\001\002\000\012\011\045\021\022\022\023\023" +
    "\021\001\002\000\004\011\uffec\001\002\000\012\004\ufff0" +
    "\010\ufff0\020\ufff0\021\ufff0\001\002\000\004\005\056\001" +
    "\002\000\004\021\057\001\002\000\004\012\060\001\002" +
    "\000\004\011\061\001\002\000\012\004\ufff5\010\ufff5\020" +
    "\ufff5\021\ufff5\001\002\000\004\010\uffff\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\015\004\010\005\011\006\014" +
    "\011\006\012\007\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\003\061\004\010\005\011\006\014\011\006" +
    "\012\007\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\007" +
    "\032\010\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\035\010" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\013\040\016\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\014\045\016\043\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\015\047\016" +
    "\050\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\014\052\016\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalisadorSintatico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalisadorSintatico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalisadorSintatico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


   
  public void report_error(String message, Object info)  { 
      System.out.println("AVISO - " + message);  
      System.out.println(info.toString());                
}
  public void report_fatal_error(String message, Object info)  {
        System.out.println("ERRO - " + message);         
        System.exit(-1);
    }               


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalisadorSintatico$actions {
  private final AnalisadorSintatico parser;

  /** Constructor */
  CUP$AnalisadorSintatico$actions(AnalisadorSintatico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalisadorSintatico$do_action_part00000000(
    int                        CUP$AnalisadorSintatico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisadorSintatico$parser,
    java.util.Stack            CUP$AnalisadorSintatico$stack,
    int                        CUP$AnalisadorSintatico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalisadorSintatico$result;

      /* select the action based on the action number */
      switch (CUP$AnalisadorSintatico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)).value;
		RESULT = start_val;
              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalisadorSintatico$parser.done_parsing();
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= INICIO ABRECHV comandos FECHACHV 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // comandos ::= comando comandos 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comandos",1, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // comandos ::= comando 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comandos",1, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // comando ::= decl 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comando",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // comando ::= obj 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comando",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // comando ::= atrib 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comando",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // comando ::= print 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("comando",2, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // print ::= IMPRIME ABREP fator FECHAP PTVG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("print",7, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-4)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // fator ::= ID 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("fator",12, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // fator ::= NUMERO 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("fator",12, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // fator ::= LITERAL 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("fator",12, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // obj ::= ID ID IGUAL NEW ID PARAM PTVG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("obj",3, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-6)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // decl ::= TIPO ID decl1 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("decl",4, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // decl1 ::= PTVG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("decl1",5, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // decl1 ::= decl2 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("decl1",5, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // decl2 ::= VG ID decl1 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("decl2",6, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // atrib ::= ID IGUAL expr PTVG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("atrib",8, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= fator IGUAL expr1 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr1 ::= PTVG 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr1",10, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr1 ::= fator OPERADOR expr2 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr1",10, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr2 ::= fator PTVG expr1 
            {
              Object RESULT =null;

              CUP$AnalisadorSintatico$result = parser.getSymbolFactory().newSymbol("expr2",11, ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.elementAt(CUP$AnalisadorSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalisadorSintatico$stack.peek()), RESULT);
            }
          return CUP$AnalisadorSintatico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalisadorSintatico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalisadorSintatico$do_action(
    int                        CUP$AnalisadorSintatico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisadorSintatico$parser,
    java.util.Stack            CUP$AnalisadorSintatico$stack,
    int                        CUP$AnalisadorSintatico$top)
    throws java.lang.Exception
    {
              return CUP$AnalisadorSintatico$do_action_part00000000(
                               CUP$AnalisadorSintatico$act_num,
                               CUP$AnalisadorSintatico$parser,
                               CUP$AnalisadorSintatico$stack,
                               CUP$AnalisadorSintatico$top);
    }
}

}
