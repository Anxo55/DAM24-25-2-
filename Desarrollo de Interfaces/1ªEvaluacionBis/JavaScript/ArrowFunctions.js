/* function abs(n) {
    // numero a valor absoluto
    return n < 0? -n : n;
} */


/* const abs = function(n) {
    // numero a valor absoluto
    return n < 0? -n : n;
} */

/* const abs = (n) => {
    return n < 0? -n : n;
 */

/* const abs = n => {
    return n < 0? -n : n;
} */

const abs = n =>  n < 0? -n : n;


console.log(abs(5))
console.log(abs(0))
console.log(abs(-0))
console.log(abs(-5))


/* function suma(a,b) {
    return a + b;
} */

/* let suma = function(a,b) {
    return a+b   
} */



    // esto devuelve directamente la funcion
let suma = (a,b) => a+b
console.log(suma(2,5))


/* function elCreador(nombre) {
    return {
        // nombre: nombre,
        // son lo mismo ya que no tiene un valor definido
        nombre,
        edad: 33,
        altura: 1.90
    }
} */



let elCreador = (nombre) => ({
    nombre,
    edad: 33,
    altura: 1.90
})


console.log(elCreador('pepe'))

const colores = ['rojo', 'verde']
const nuevosColores = [...colores, 'amarillo', 'azul']
console.log(nuevosColores)
