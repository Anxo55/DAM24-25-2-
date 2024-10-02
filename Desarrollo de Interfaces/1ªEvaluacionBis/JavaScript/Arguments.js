function sumar() {
console.log(arguments)
let total = 0

    for(let i = 0; i < arguments.length; i++) {
        total += arguments[i]
    }

    return total
}

const r = sumar(2,3,4,8,1)

console.log(r) // Imprime: 5


// Otra forma, con el operador rest
function multiplicar(...numeros) {
console.log(numeros)
let total = 1
    for(let numero of numeros) {
        total *= numero
    }

    return total

}

const r2 = multiplicar(2,5,7)
console.log(r2)


