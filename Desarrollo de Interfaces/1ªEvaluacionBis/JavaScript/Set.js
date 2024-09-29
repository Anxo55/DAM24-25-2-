let valores = new Set([2,3,5,2])

console.log(valores) 

valores.add(9)

console.log(valores)

valores.delete(3)

console.log(valores)

console.log(valores.has(9))
console.log(valores.has(20))

// valores.clear

// el total de valores del Set
console.log(valores.size)

for(numero of valores) {
    console.log(numero)  
}

console.log(valores.values())

