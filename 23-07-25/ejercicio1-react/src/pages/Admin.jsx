import { useLocation, Navigate, useNavigate } from 'react-router-dom';
import { useEffect } from 'react';

export default function Admin() {
  const location = useLocation();
  const navigate = useNavigate();

  // Comprobar si existe el parámetro ?auth=true
  const params = new URLSearchParams(location.search);
  const auth = params.get('auth');

  useEffect(() => {
    if (auth !== 'true') {
      // Redirige a login si no está autorizado
      navigate('/login');
    }
  }, [auth, navigate]);

  if (auth !== 'true') {
    // Retornar null o loader mientras redirige
    return null;
  }

  return (
    <div className="admin-container">
      <h1>Panel de Administración</h1>
      <section className="admin-section">
        <h2>Gestión de Cursos</h2>
        <p>Aquí podrás agregar, editar o eliminar cursos (funcionalidad simulada).</p>
        <button
          onClick={() => alert('Funcionalidad no implementada aún')}
          className="btn-primary"
        >
          Añadir nuevo curso
        </button>
      </section>

      <section className="admin-section">
        <h2>Usuarios</h2>
        <p>Administra los usuarios registrados y sus roles.</p>
        <button
          onClick={() => alert('Funcionalidad no implementada aún')}
          className="btn-primary"
        >
          Ver usuarios
        </button>
      </section>

      <section className="admin-section">
        <h2>Reportes</h2>
        <p>Accede a estadísticas y reportes de uso de la plataforma.</p>
        <button
          onClick={() => alert('Funcionalidad no implementada aún')}
          className="btn-primary"
        >
          Ver reportes
        </button>
      </section>
    </div>
  );
}
