import { Link } from 'react-router-dom';

export default function NotFound() {
  return (
    <div className="notfound-container">
      <h1>404</h1>
      <h2>Página no encontrada</h2>
      <p>Lo sentimos, la página que buscas no existe o ha sido movida.</p>
      <Link to="/">
        <button className="btn-primary">Volver al Inicio</button>
      </Link>
    </div>
  );
}
