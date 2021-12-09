import { Link } from 'react-router-dom';

const NotFound  = () => {
    return(
        <>
            <h1>404 Ops! A página não foi encontrada.</h1>
            <Link to="/">Home</Link>
        </>
    );
}

export default NotFound;