import './style.scss';

const Header = () => {
    return(
        <>
        <label className="toggle-header" for="checkbox"><span className="symbol">&equiv;</span></label>
        <input type="checkbox" className="toggle-checkbox" id="checkbox"/>
        <div className="background"></div>
        <div className="header">
            <nav class="header__nav">
                <ul className="header__nav__lista">    
                    <li className="header__nav__lista__item">Item 1</li>
                    <li className="header__nav__lista__item">Item 2</li>
                    <li className="header__nav__lista__item">Item 3</li>
                    <li className="header__nav__lista__item">Item 4</li>
                </ul>
            </nav>
        </div>
        </>
    );
}

export default Header;