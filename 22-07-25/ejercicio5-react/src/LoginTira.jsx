import React, { useState } from 'react';

function LoginTira() {
  const longitud = 6;
  const combinacionCorrecta = [true, false, true, false, true, true];

  const [combinacion, setCombinacion] = useState(Array(longitud).fill(false));
  const [mensaje, setMensaje] = useState('');

  const toggleCirculo = (index) => {
    const nueva = [...combinacion];
    nueva[index] = !nueva[index];
    setCombinacion(nueva);
    setMensaje('');
  };

  const verificarCombinacion = () => {
    const esCorrecta = combinacion.every(
      (valor, i) => valor === combinacionCorrecta[i]
    );
    if (esCorrecta) {
      setMensaje('🎉 ¡Login completado! 🎉');
    } else {
      setMensaje('❌ Combinación incorrecta. Intenta de nuevo.');
    }
  };

  const resetear = () => {
    setCombinacion(Array(longitud).fill(false));
    setMensaje('');
  };

  return (
    <div style={{
      maxWidth: '520px',
      margin: '50px auto',
      padding: '30px',
      borderRadius: '15px',
      background: '#1e1e1e',
      boxShadow: '0 8px 25px rgba(0, 0, 0, 0.8)',
      color: '#ddd',
      fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
      textAlign: 'center'
    }}>
      <h2 style={{ marginBottom: '30px', fontWeight: '700', fontSize: '2rem', color: '#fafafa' }}>
        Introduce la combinación correcta
      </h2>

      <div style={{
        display: 'flex',
        justifyContent: 'center',
        gap: '25px',
        marginBottom: '40px'
      }}>
        {combinacion.map((estado, i) => (
          <div
            key={i}
            onClick={() => toggleCirculo(i)}
            style={{
              width: '70px',
              height: '70px',
              backgroundColor: estado ? '#4caf50' : '#555555',
              borderRadius: '50%',
              cursor: 'pointer',
              boxShadow: estado 
                ? '0 0 15px 5px #4caf50, inset 0 0 10px #388e3c'
                : 'inset 0 0 8px #333333',
              transition: 'all 0.35s ease',
              border: '2px solid #444',
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'center',
              fontWeight: '700',
              fontSize: '1.4rem',
              userSelect: 'none',
              color: estado ? '#e8f5e9' : '#bbb',
              textShadow: estado ? '0 0 6px #2e7d32' : 'none',
              userSelect: 'none',
            }}
            title={`Círculo ${i + 1}: ${estado ? 'ON' : 'OFF'}`}
          >
            {estado ? 'ON' : 'OFF'}
          </div>
        ))}
      </div>

      <div>
        <button
          onClick={verificarCombinacion}
          style={{
            padding: '14px 28px',
            marginRight: '20px',
            fontSize: '1.15rem',
            borderRadius: '10px',
            border: 'none',
            backgroundColor: '#2e7d32',
            color: 'white',
            cursor: 'pointer',
            boxShadow: '0 5px 15px rgba(46, 125, 50, 0.6)',
            fontWeight: '600',
            transition: 'background-color 0.3s'
          }}
          onMouseDown={e => e.currentTarget.style.backgroundColor = '#1b4d20'}
          onMouseUp={e => e.currentTarget.style.backgroundColor = '#2e7d32'}
          onMouseLeave={e => e.currentTarget.style.backgroundColor = '#2e7d32'}
        >
          Verificar
        </button>

        <button
          onClick={resetear}
          style={{
            padding: '14px 28px',
            fontSize: '1.15rem',
            borderRadius: '10px',
            border: 'none',
            backgroundColor: '#b71c1c',
            color: 'white',
            cursor: 'pointer',
            boxShadow: '0 5px 15px rgba(183, 28, 28, 0.6)',
            fontWeight: '600',
            transition: 'background-color 0.3s'
          }}
          onMouseDown={e => e.currentTarget.style.backgroundColor = '#7f1313'}
          onMouseUp={e => e.currentTarget.style.backgroundColor = '#b71c1c'}
          onMouseLeave={e => e.currentTarget.style.backgroundColor = '#b71c1c'}
        >
          Resetear
        </button>
      </div>

      {mensaje && (
        <p style={{
          marginTop: '30px',
          fontWeight: '700',
          fontSize: '1.3rem',
          color: mensaje.includes('completado') ? '#81c784' : '#ef9a9a',
          userSelect: 'none',
          textShadow: '0 0 6px rgba(0,0,0,0.7)'
        }}>
          {mensaje}
        </p>
      )}
    </div>
  );
}

export default LoginTira;
