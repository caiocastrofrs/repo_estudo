const Sequelize = require('sequelize');

const sequelize = new Sequelize('db_musimundos_v2', 'root', '8956', {
	host: 'localhost',
	dialect: 'mysql'
})

sequelize.authenticate()
.then(() => {
console.log("Conectado com sucesso!")
}).catch((error) => {
console.log("Erro ao conectar com DB!", error)
}) 


sequelize.query('show tables').then(function(rows)
{
    console.log(JSON.stringify(rows));
})
