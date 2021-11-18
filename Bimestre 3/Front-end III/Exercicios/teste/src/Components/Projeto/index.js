import './style.css';

const Projeto = ({nome, src}) => {
    return(
        <>
        <div className="projeto">
            <h1>{nome}</h1>
            <img src={src} alt="imagem do projeto"/>
        </div>
        </>
    );
}

export default Projeto;