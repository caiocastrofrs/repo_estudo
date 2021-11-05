const Pessoa = ({nome,profissao,texto,foto}) => {
    return(
        <>
            <h2>Nome: {nome}</h2>
            <h4>Profissão: {profissao}</h4>
            <p>{texto}</p>
            <img src={foto} alt="foto do meliante"/>
        </>
    )
}
export default Pessoa;