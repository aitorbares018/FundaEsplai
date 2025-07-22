import { useState } from 'react';

function App() {
  const cantidad = 5;

  const colorInicial = Array(cantidad).fill('gray');
  const [colores, setColores] = useState(colorInicial);

  const cambiarColor = (index) => {
    const nuevos = [...colores];
    nuevos[index] = nuevos[index] === 'orange' ? 'gray' : 'orange';
    setColores(nuevos);
  };

  const ponerTodosRojos = () => {
    setColores(Array(cantidad).fill('red'));
  };

  const restaurarOriginal = () => {
    setColores(colorInicial);
  };

  return (
    <div
      style={{
        height: '100vh',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center',
      }}
    >
      <div style={{ display: 'flex', justifyContent: 'center', gap: '20px', marginBottom: '20px' }}>
        {colores.map((color, index) => (
          <div
            key={index}
            onClick={() => cambiarColor(index)}
            style={{
              width: '60px',
              height: '60px',
              borderRadius: '50%',
              backgroundColor: color,
              cursor: 'pointer',
              transition: '0.3s',
            }}
          />
        ))}
      </div>

      <div>
        <button onClick={ponerTodosRojos} style={{ marginRight: '10px' }}>
          Poner rojos
        </button>
        <button onClick={restaurarOriginal}>
          Quitar rojos
        </button>
      </div>
    </div>
  );
}

export default App;
