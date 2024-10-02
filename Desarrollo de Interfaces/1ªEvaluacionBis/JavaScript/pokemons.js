// promesas con then / catch
fetch('https://pokeapi.co/api/v2/pokemon/bulbasaur')
    .then(response => response.json())
    .then(dataJson => console.log(dataJson.weight/10 +'kg'))
    .catch(error => console.error('No existe el pokemon:'))
    

// promesas con async/await
async function consultarPeso(nombre){
    try {
        const response = await fetch('https://pokeapi.co/api/v2/pokemon/bulbasaur')
        const dataJson = await response.json()
        console.log(dataJson.weight/10 + 'kg')
    } catch (error) {
        console.log('No existe el pokemon')
    }

}

consultarPeso('bulbasaur')