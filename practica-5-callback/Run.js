function callbackF(text) {
    console.log("Estoy dentro de la callback ".concat(text));
}
function algoConCallbackF(textoInicial, callback) {
    console.log("dentro de algoConCallBackF ".concat(textoInicial));
    callback(textoInicial);
}
algoConCallbackF("mi texto", callbackF);
