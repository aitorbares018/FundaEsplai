import React from 'react';

function Display({ valor }) {
  return (
    <div style={{
      backgroundColor: '#222',
      color: '#eee',
      fontSize: '4rem',
      padding: '30px 20px',
      borderRadius: '20px',
      textAlign: 'right',
      marginBottom: '25px',
      boxShadow: 'inset 0 2px 8px rgba(0,0,0,0.7)',
      fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
      userSelect: 'none',
      minHeight: '100px',
      overflowX: 'auto',
      whiteSpace: 'nowrap'
    }}>
      {valor}
    </div>
  );
}

export default Display;
