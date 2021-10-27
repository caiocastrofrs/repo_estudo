import './style.css';

const banner = ({texto, children}) => {
    return(
        <div className="banner">
            <h2>{texto}</h2>
            {children}
        </div>
    );
}

export default banner;
