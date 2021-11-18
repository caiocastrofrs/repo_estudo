import './style.css';
import Video from '../Video';

const Galeria = () => {
    return(
        <section id="galeria">
            <div className="grid">
                <Video url="https://www.youtube.com/watch?v=gSJeHDlhYls&ab_channel=StonesThrow" title='Madvillain - All Caps' />
                <Video url="https://www.youtube.com/watch?v=rpaonSDPw7Y&ab_channel=StonesThrow" title='MF DOOM - Madvillain - Accordion' />
                <Video url="https://www.youtube.com/watch?v=NYpXwlGT7XE&ab_channel=StonesThrow" title='Madvillain - Fancy Clown' />              
            </div>
        </section>
    );
}

export default Galeria;