
/* --------------------------Codigo de Usuario----------------------- */
package ejemplocup;

import java_cup.runtime.*;
import java.io.Reader;
      
%% //inicio de opciones
   
/* ------ Seccion de opciones y declaraciones de JFlex -------------- */  
   
/* 
    Cambiamos el nombre de la clase del analizador a Lexer
*/
%class AnalizadorLexico

/*
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%line
%column
    
/* 
   Activamos la compatibilidad con Java CUP para analizadores
   sintacticos(parser)
*/
%cup
   
/*
    Declaraciones

    El codigo entre %{  y %} sera copiado integramente en el 
    analizador generado.
*/
%{
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   

/*
    Macro declaraciones
  
    Declaramos expresiones regulares que despues usaremos en las
    reglas lexicas.
*/
   
/*  Un salto de linea es un \n, \r o \r\n dependiendo del SO   */
//Salto = \r|\n|\r\n
   
/* Espacio es un espacio en blanco, tabulador \t, salto de linea 
    o avance de pagina \f, normalmente son ignorados */
//Espacio     = {Salto} | [ \t\f]
   
/* Una literal entera es un numero 0 oSystem.out.println("\n*** Generado " + archNombre + "***\n"); un digito del 1 al 9 
    seguido de 0 o mas digitos del 0 al 9 */
//Entero = 0 | [1-9][0-9]*

EXP_ALPHA=[A-Za-z]
EXP_DIGITO=[0-9]
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
ENTERO=({EXP_DIGITO})+
IDENTIFICADOR={EXP_ALPHA}({EXP_ALPHANUMERIC})*
ESPACIO=" "
SALTO=\n|\r|\r\n
CADENA="\""({ESPACIO}|{EXP_ALPHANUMERIC})*"\""
COMENTARIOUNO="\-"({ESPACIO}|{EXP_ALPHANUMERIC})*"\-"
COMENTARIODOS="\*"({ESPACIO}|{EXP_ALPHANUMERIC})*"\*"
%% //fin de opciones
/* -------------------- Seccion de reglas lexicas ------------------ */
   
/*
   Esta seccion contiene expresiones regulares y acciones. 
   Las acciones son código en Java que se ejecutara cuando se
   encuentre una entrada valida para la expresion regular correspondiente */
   
   /* YYINITIAL es el estado inicial del analizador lexico al escanear.
      Las expresiones regulares solo serán comparadas si se encuentra
      en ese estado inicial. Es decir, cada vez que se encuentra una 
      coincidencia el scanner vuelve al estado inicial. Por lo cual se ignoran
      estados intermedios.*/
   
<YYINITIAL> {

    "Int"       { System.out.print(" Int "); return symbol(sym.TIPO_INT); }
    "Bool"      { System.out.print(" Bool "); return symbol(sym.TIPO_BOOL); }
    "String"    { System.out.print(" String "); return symbol(sym.TIPO_STRING); }
    "SELFTYPE"  { System.out.print(" SELFTYPE "); return symbol(sym.SELF_TYPE); }
    "class"     { System.out.print(" class "); return symbol(sym.CLASS); }
    "else"      { System.out.print(" else "); return symbol(sym.ELSE); }
    "false"     { System.out.print(" false "); return symbol(sym.BOOLEAN_FALSE); }
    "fi"        { System.out.print(" fi "); return symbol(sym.FI); }
    "in"        { System.out.print(" in "); return symbol(sym.IN); }
    "inherits"  { System.out.print(" inherits "); return symbol(sym.INHERITS); }
    "isvoid"    { System.out.print(" isvoid "); return symbol(sym.ISVOID); }
    "let"       { System.out.print(" let "); return symbol(sym.LET); }
    "loop"      { System.out.print(" loop "); return symbol(sym.LOOP); }
    "pool"      { System.out.print(" pool "); return symbol(sym.POOL); }
    "then"      { System.out.print(" then "); return symbol(sym.THEN); }
    "while"     { System.out.print(" while "); return symbol(sym.WHILE); }
    "case"      { System.out.print(" case "); return symbol(sym.CASE); }
    "esac"      { System.out.print(" esac "); return symbol(sym.ESAC); }
    "new"       { System.out.print(" new "); return symbol(sym.NEW); }
    "of"        { System.out.print(" of "); return symbol(sym.OF); }
    "not"       { System.out.print(" not "); return symbol(sym.NOT); }
    "true"      { System.out.print(" true "); return symbol(sym.BOOLEAN_TRUE); }
    "+="        { System.out.print(" += "); return symbol(sym.OP_SUMAIGUAL); }
    "="         { System.out.print(" = "); return symbol(sym.OP_IGUAL); }
    "<"         { System.out.print(" < "); return symbol(sym.OP_MENORQ); }
    "<="        { System.out.print(" <= "); return symbol(sym.OP_MENORIGUALQ); }
    "<-"        { System.out.print(" <- "); return symbol(sym.LEFT_ALLOC); }      
    "{"         { System.out.print(" { "); return symbol(sym.CBLEFT); }
    "}"         { System.out.print(" } "); return symbol(sym.CBRIGHT); }
    "=>"        { System.out.print(" => "); return symbol(sym.RIGHT_ALLOC); }
    "^"         { System.out.print(" ^ "); return symbol(sym.OP_POW); }
    ","         { System.out.print(" , "); return symbol(sym.COMA); }
    "@"         { System.out.print(" @ "); return symbol(sym.ARROBA); }
    ":"         { System.out.print(" : "); return symbol(sym.TWO_POINTS); }
    "."         { System.out.print(" . "); return symbol(sym.POINT); }
    "~"         { System.out.print(" ~ "); return symbol(sym.NEGATION); }      
    ";"         { System.out.print(" ; "); return symbol(sym.SEMI); }
    "+"         { System.out.print(" + "); return symbol(sym.OP_SUMA); }
    "-"         { System.out.print(" - "); return symbol(sym.OP_RESTA); }
    "*"         { System.out.print(" * "); return symbol(sym.OP_MULT); }
    "/"         { System.out.print(" / "); return symbol(sym.OP_DIV); }
    "("         { System.out.print(" ( "); return symbol(sym.PARENIZQ); }
    ")"         { System.out.print(" ) "); return symbol(sym.PARENDER); }
   
    /* Si se encuentra un entero, se imprime, se regresa un token numero
        que representa un entero y el valor que se obtuvo de la cadena yytext
        al convertirla a entero. yytext es el token encontrado. */
    {ENTERO}      {   System.out.print(yytext()); 
                      return symbol(sym.ENTERO, new Integer(yytext())); }
    {CADENA}      {   System.out.print(yytext()); 
                      return symbol(sym.CADENA, new String(yytext())); }
    /* No hace nada si encuentra el espacio en blanco */
    {ESPACIO}       { /* ignora el espacio */ } 
}


/* Si el token contenido en la entrada no coincide con ninguna regla
    entonces se marca un token ilegal */
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }
