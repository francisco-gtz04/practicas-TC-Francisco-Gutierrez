
function callbackF(text:string){
    console.log(`Estoy dentro de la callback ${text}`);
}

function algoConCallbackF(textoInicial:string,
                            callback: (textoInicial:string) => void
){
    console.log(`dentro de algoConCallBackF ${textoInicial}`);
    callback(textoInicial);
}

algoConCallbackF("mi texto", callbackF);


