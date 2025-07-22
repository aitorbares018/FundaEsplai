import React, { useState } from 'react';
import Display from './components/Display';
import Tecla from './components/Tecla';

function Calculadora() {
  const [display, setDisplay] = useState('0');

  const manejarClick = (tecla) => {
    if (tecla === 'C') {
      setDisplay('0');
      return;
    }
    if (tecla === '=') {
      try {
        
        const expresion = display.replace(/÷/g, '/').replace(/×/g, '*');
        const resultado = eval(expresion);
        setDisplay(String(resultado));
      } catch {
        setDisplay('Error');
      }
      return;
    }

    const operadores = ['+', '-', '×', '÷'];
    const ultimoChar = display.slice(-1);

    if (operadores.includes(tecla)) {
      if (display === '0') return;
      if (operadores.includes(ultimoChar)) {
        setDisplay(display.slice(0, -1) + tecla);
        return;
      }
    }

    if (display === '0' && tecla !== '.') {
      setDisplay(tecla);
    } else {
      setDisplay(display + tecla);
    }
  };

  const teclas = [
    { texto: '7', valor: '7' },
    { texto: '8', valor: '8' },
    { texto: '9', valor: '9' },
    { texto: '÷', valor: '÷' },

    { texto: '4', valor: '4' },
    { texto: '5', valor: '5' },
    { texto: '6', valor: '6' },
    { texto: '×', valor: '×' },

    { texto: '1', valor: '1' },
    { texto: '2', valor: '2' },
    { texto: '3', valor: '3' },
    { texto: '-', valor: '-' },

    { texto: 'C', valor: 'C' },
    { texto: '0', valor: '0' },
    { texto: '.', valor: '.' },
    { texto: '+', valor: '+' },
  ];

  return (
    <div style={{
      width: '500px',
      margin: '60px auto',
      padding: '30px',
      borderRadius: '25px',
      backgroundColor: '#121212',
      boxShadow: '0 12px 40px rgba(0,0,0,0.9)',
      fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
      display: 'flex',
      flexDirection: 'column',
      alignItems: 'center',
    }}>
      <Display valor={display} />

      <div style={{
        display: 'grid',
        gridTemplateColumns: 'repeat(4, 1fr)',
        gap: '18px',
        width: '100%',
        justifyItems: 'center'
      }}>
        {teclas.map(({ texto, valor }, i) => {
          let colorFondo = '#333';
          if (['+', '-', '×', '÷'].includes(valor)) colorFondo = '#ff9500';
          if (texto === 'C') colorFondo = '#ff3b30';

          return (
            <Tecla
              key={i}
              texto={texto}
              onClick={manejarClick}
              colorFondo={colorFondo}
            />
          );
        })}
      </div>

      <button
        onClick={() => manejarClick('=')}
        style={{
          marginTop: '30px',
          width: '100%',
          height: '100px',
          fontSize: '2.6rem',
          borderRadius: '25px',
          border: 'none',
          backgroundColor: '#34c759',
          color: 'white',
          fontWeight: '700',
          cursor: 'pointer',
          boxShadow: '0 8px 25px rgba(52,199,89,0.7)',
          userSelect: 'none',
          transition: 'background-color 0.3s',
        }}
        onMouseDown={e => e.currentTarget.style.backgroundColor = '#28a745'}
        onMouseUp={e => e.currentTarget.style.backgroundColor = '#34c759'}
        onMouseLeave={e => e.currentTarget.style.backgroundColor = '#34c759'}
      >
        =
      </button>
    </div>
  );
}

export default Calculadora;
