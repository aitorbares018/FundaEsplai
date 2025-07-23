import { NavLink } from 'react-router-dom';

const linkStyle = ({ isActive }) => ({
  textDecoration: 'none',
  fontWeight: isActive ? 'bold' : 'normal',
  color: isActive ? '#007bff' : '#333',
});

function Navbar() {
  return (
    <nav>
      <div className="logo">Formación Pro</div>
      <div className="links">
        <NavLink to="/" style={linkStyle}>Inicio</NavLink>
        <NavLink to="/cursos" style={linkStyle}>Cursos</NavLink>
        <NavLink to="/contacto" style={linkStyle}>Contacto</NavLink>
        <NavLink to="/perfil" style={linkStyle}>Perfil</NavLink>
      </div>
    </nav>
  );
}

export default Navbar;
