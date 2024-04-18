/*var: para declarar variables. El scope (o alcance) de las variables declaradas con var
 es a nivel de Execution Context */

 /*
var mensaje = 'tierra';

if (true) {
    var mensaje = 'agua'
}

console.log(mensaje);*/


/* let: Crea variables con un scope(que funcionan en donde fue declarada, 
no permitiendo una refinicion de la variable*/

/*
let mensaje = 'tierra';

if (true) {
   let mensaje = 'agua'
}

console.log(mensaje);
*/

//Forma de declarar funciones
/*
function llamar(contacto:string,
                mensaje:string = "Este es un mensaje por default"){
                    console.log(`${ contacto} hola, ${mensaje}`);
                }
*/

//llamar('Amiga');
//llamar('Amiga', 'como estas amiga?');

//Funcion flecha
/*
const miFun = function(a:string){
    return a.toUpperCase();
}

console.log(miFun("hello"));
*/

const miFunFlecha = (a:string) => a.toUpperCase();

console.log(miFunFlecha("hello Flecha"));




