import './App.css';
import { Thumbs } from './Thumbs';
import { Tricolor } from './Tricolor';
import { Fotos } from './Fotos';

function App() {
  return (
    <div
      style={{
        minHeight: '100vh',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        background: '#f0f0f0',
        fontFamily: 'sans-serif',
        paddingTop: '40px',
      }}
    >
      {/* Título principal */}
      <h1 style={{ marginBottom: '60px' }}>Ejercicio 2</h1>

      {/* Contenedor de los tres componentes */}
      <div
        style={{
          display: 'flex',
          gap: '60px',
          background: '#fff',
          padding: '40px',
          borderRadius: '12px',
          boxShadow: '0 4px 12px rgba(0,0,0,0.1)',
        }}
      >
        <div style={{ textAlign: 'center' }}>
          <h3>👍 Thumbs</h3>
          <Thumbs />
        </div>

        <div style={{ textAlign: 'center' }}>
          <h3>🎨 Tricolor</h3>
          <Tricolor />
        </div>

        <div style={{ textAlign: 'center' }}>
          <h3>🚗 Fotos</h3>
          <Fotos />
        </div>
      </div>
    </div>
  );
}

export default App;
