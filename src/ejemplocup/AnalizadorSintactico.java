
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Oct 04 00:52:59 CDT 2015
//----------------------------------------------------

package ejemplocup;

import java_cup.runtime.*;
import java.io.FileReader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Oct 04 00:52:59 CDT 2015
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\005\005\000\002\013\003\000\002\013\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\006\006\000\002\007\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\004\017\006\001\002\000\006\002\025\017" +
    "\006\001\002\000\006\002\uffff\017\uffff\001\002\000\010" +
    "\013\012\014\007\015\011\001\002\000\006\025\ufff9\046" +
    "\ufff9\001\002\000\006\025\016\046\013\001\002\000\006" +
    "\025\ufffb\046\ufffb\001\002\000\006\025\ufffa\046\ufffa\001" +
    "\002\000\004\047\023\001\002\000\006\002\ufffc\017\ufffc" +
    "\001\002\000\006\002\ufffd\017\ufffd\001\002\000\010\013" +
    "\012\014\007\015\011\001\002\000\006\002\ufffe\017\ufffe" +
    "\001\002\000\004\046\021\001\002\000\004\047\022\001" +
    "\002\000\006\002\ufff8\017\ufff8\001\002\000\006\002\ufff7" +
    "\017\ufff7\001\002\000\006\002\001\017\001\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\006\002\003\005\004\001\001\000\004\005" +
    "\023\001\001\000\002\001\001\000\004\011\007\001\001" +
    "\000\002\001\001\000\010\006\014\007\013\013\016\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\011\017\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
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
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));
                if (s.right >= 0)
                    m.append(", column "+(s.right+1));
            }
        }
        m.append(" : "+message);
        System.err.println(m);
    }
   
    /* Cuando se encuentra un error de donde el sistema no puede
        recuperarse, se lanza un error fatal. Se despliega el mensaje
        de error y se finaliza la ejecucion. */
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

    /* Metodo main para garantizar la ejecucion del analizador
       lexico y sintactico, ademas que se pase como parametro la tabla
       de simbolos correspondiente. */
    public static void main(String[] args){
        try {
            AnalizadorSintactico asin = new AnalizadorSintactico(
                    new AnalizadorLexico( new FileReader(args[0])));
            Object result = asin.parse().value;
            System.out.println("\n*** Resultados finales ***");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // class2 ::= CBLEFT CBRIGHT 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("class2",5, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // class1 ::= INHERITS type CBLEFT CBRIGHT 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("class1",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // type ::= TIPO_BOOL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("type",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // type ::= TIPO_INT 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("type",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // type ::= TIPO_STRING 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("type",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // chingada ::= class2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("chingada",9, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // chingada ::= class1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("chingada",9, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // classdecl ::= CLASS type chingada 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("classdecl",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= classdecl 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= program classdecl 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
