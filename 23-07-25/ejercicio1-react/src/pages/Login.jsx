import { useNavigate } from 'react-router-dom';

export default function Login() {
  const navigate = useNavigate();

  const iniciarSesion = () => {
    alert('¡Sesión iniciada!');
    navigate('/perfil');
  };

  return (
    <div className="login-box">
      <h2>Inicia sesión</h2>
      <input type="text" placeholder="Usuario" style={{ padding: '10px', marginBottom: '10px', width: '100%' }} />
      <input type="password" placeholder="Contraseña" style={{ padding: '10px', marginBottom: '20px', width: '100%' }} />
      <button onClick={iniciarSesion}>Entrar</button>
    </div>
  );
}
import React from 'react';