package ExemploCUP;
import java_cup.runtime.*;
%%
%cup
%public
%class Lexer
%line
%column
%{
  private Symbol symbol(int type) { return new Symbol(type, yyline, yycolumn); }
  private Symbol symbol(int type, Object value) { return new Symbol(type, yyline, yycolumn, value);  }
%}
DIGITO = [0-9]
LETRA = [a-zA-Z_]
LITERAL =  \"[^\"]*\"
INTEIRO = {DIGITO}+
NUMERO = {INTEIRO}["."{INTEIRO}]
ID = {LETRA}[{LETRA}|{INTEIRO}]+
OPERADOR = "+" | "-" | "/" | "*"
TIPO = "int" | "boolean" | "char" | "double"
IGNORE = [\n|\s|\t\r]
%%

<YYINITIAL> {
    "main"          {return new Symbol(Sym.INICIO); }
    "new"           {return new Symbol(Sym.NEW); }
    "print"         {return new Symbol(Sym.IMPRIME); }
    "int"           {return new Symbol(Sym.TIPO_INTEIRO); }
    "caracter"      {return new Symbol(Sym.TIPO_CHAR); }    
    ";"             {return new Symbol(Sym.PTVG); }
    ","             {return new Symbol(Sym.VG); }
    "{"             {return new Symbol(Sym.ABRECHV); }
    "}"             {return new Symbol(Sym.FECHACHV); }
    "()"            {return new Symbol(Sym.PARAM); }
    "("             {return new Symbol(Sym.ABREP); }
    ")"             {return new Symbol(Sym.FECHAP); }
    "="             {return new Symbol(Sym.IGUAL); }
    "<-"            {return new Symbol(Sym.SIMBOLO_ATRIB); }   
    {LITERAL}       {return new Symbol(Sym.LITERAL); }
    {NUMERO}        {return new Symbol(Sym.NUMERO); }  
    {ID}            {return new Symbol(Sym.ID); }
    {OPERADOR}      {return new Symbol(Sym.OPERADOR);}
    {TIPO}          {return new Symbol(Sym.TIPO); }
    
    {IGNORE}        {}   
}

<<EOF>> { return new Symbol( Sym.EOF ); }
[^] { throw new Error("caracter inválido: "+yytext()+" na linha "+(yyline+1)+", coluna "+(yycolumn+1) ); }
