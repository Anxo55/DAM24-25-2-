// console.log('Start')

// setTimeout(function() { console.log('operacion') }, 2000)

// console.log('end')

// callbacks
// promesas
// async/await

console.log('Iniciando conezion...')
fetch('https://randomuser.me/api')
    .then(response => response.json() )
    .then(dataJson => console.log(dataJson.results[0].name.first) )
    .then(dataJson => console.log(dataJson.results[1].name.last))


console.log('Pidiendo datos...')