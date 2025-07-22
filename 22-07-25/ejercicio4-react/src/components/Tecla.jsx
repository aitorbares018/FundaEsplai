import React from 'react';

function Tecla({ texto, onClick, colorFondo }) {
  return (
    <button
      onClick={() => onClick(texto)}
      style={{
        backgroundColor: colorFondo || '#333',
        border: 'none',
        borderRadius: '20px',
        boxShadow: '0 5px 15px rgba(0,0,0,0.8)',
        fontSize: '2.4rem',
        fontWeight: '700',
        color: '#eee',
        cursor: 'pointer',
        width: '90px',
        height: '90px',
        margin: '12px',
        transition: 'background-color 0.25s',
        userSelect: 'none',
      }}
      onMouseDown={e => e.currentTarget.style.backgroundColor = '#555'}
      onMouseUp={e => e.currentTarget.style.backgroundColor = colorFondo || '#333'}
      onMouseLeave={e => e.currentTarget.style.backgroundColor = colorFondo || '#333'}
    >
      {texto}
    </button>
  );
}

export default Tecla;
