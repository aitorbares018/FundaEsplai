import { Outlet, NavLink } from 'react-router-dom';

export default function MainLayout() {
  return (
    <>
      <header>
        <NavLink to="/" className="logo-link">
          <h1>🚀 Portal Cursos</h1>
        </NavLink>
        <nav>
          <NavLink
            to="/"
            end
            className={({ isActive }) => (isActive ? 'active' : '')}
          >
            Inicio
          </NavLink>
          <NavLink
            to="/cursos"
            className={({ isActive }) => (isActive ? 'active' : '')}
          >
            Cursos
          </NavLink>
          <NavLink
            to="/admin"
            className={({ isActive }) => (isActive ? 'active' : '')}
          >
            Admin
          </NavLink>
          <NavLink
            to="/login"
            className={({ isActive }) => (isActive ? 'active' : '')}
          >
            Login
          </NavLink>
        </nav>
      </header>

      <main>
        <Outlet />
      </main>

      <footer>© 2025 Portal de Cursos. Todos los derechos reservados.</footer>
    </>
  );
}
