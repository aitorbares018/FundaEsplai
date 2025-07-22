import { useState } from 'react';

export function Tricolor() {
  const colores = ['gray', 'red', 'green', 'blue'];
  const [index, setIndex] = useState(0);

  const cambiarColor = () => {
    setIndex((prev) => (prev + 1) % colores.length);
  };

  return (
    <div
      onClick={cambiarColor}
      style={{
        width: '60px',
        height: '60px',
        borderRadius: '50%',
        backgroundColor: colores[index],
        boxShadow: '0 4px 8px rgba(0,0,0,0.2)',
        cursor: 'pointer',
        transition: 'background-color 0.3s, transform 0.2s',
      }}
    />
  );
}
