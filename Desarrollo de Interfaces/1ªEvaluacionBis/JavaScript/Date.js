let hoy = new Date()

let fechaConcreta = new Date("2024-11-25")

console.log(hoy.getFullYear()) //2024
console.log(hoy.getDay()) //1 = lunes 0-6   domigno = 0
console.log(hoy.getDate()) //30
console.log(hoy.getMonth()) //8 = septiembre, imprime de 0 al 11

console.log(hoy.getHours())
console.log(hoy.getMinutes())
console.log(hoy.getSeconds())
console.log(hoy.getMilliseconds())

console.log(hoy.getTime())
console.log(hoy.toDateString())