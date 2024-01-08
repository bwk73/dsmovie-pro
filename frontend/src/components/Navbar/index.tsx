/* eslint-disable jsx-a11y/anchor-has-content */
import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https:github.com/devsuperior"></a>
          <div className="dsmovie-contact-continer">
            <GithubIcon />
            <p className="dsmovie-contact-link">/devsuperior</p>
          </div>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
