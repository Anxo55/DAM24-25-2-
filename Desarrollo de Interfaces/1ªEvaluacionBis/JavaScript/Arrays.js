let colores = ['rojo', 'verde', 'azul']

colores.push('rosa')

console.log(colores[0]) //rojo
console.log(colores[9]) //undefined
console.log(colores[colores.length-1]) //sin el -1 saldría undefined

colores[1] = 'amarillo'

console.log(colores) 

let ultimo = colores.pop()
console.log(colores)

colores.unshift('naranja')

console.log(colores)

let primero = colores.shift()

console.log(colores)


let a1 = [1,5,7,5]
let a2 = [8,9]

let nuevo = a1.concat(a2)
console.log(a1)
console.log(a2)
console.log(nuevo)


let nombres = ['Antonio', 'Isabel', 'Pepe', 'Angel']

for(let i = 0; i < nombres.length; i++) {
    console.log(nombres[i])
}

for(let indice in nombres) {
    console.log(nombres[indice])
}

for(let persona of nombres) {
    console.log(persona)
}

nombres.forEach(persona => {
    console.log(persona)
})

nombres.forEach( function (persona) {console.log(persona)} )

nombres.forEach( function (persona,indice) {console.log(indice, persona)} )

let notas = [
    [7,5,8],
    [5,5,6],
    [9,7,8]
]

console.log(notas[1][2])

const frutas = ['pera', 'limon']

frutas[0] = 'manzana'

frutas.push('platano')

console.log(frutas)

