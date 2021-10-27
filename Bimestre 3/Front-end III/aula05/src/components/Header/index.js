import './style.css';
const header = () => {
    return(
        <header className="header">
            <img src="https://picsum.photos/100" alt="logo" className="logo"/>
            <ul className="lista">
                <li>Sobre</li>
                <li>Contato</li>
                <li>Projetos</li>
            </ul>
        </header>
    );
}

export default header;