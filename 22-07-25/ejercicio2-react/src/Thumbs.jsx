import { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faThumbsUp, faThumbsDown } from '@fortawesome/free-solid-svg-icons';

export function Thumbs() {
  const [like, setLike] = useState(true);

  return (
    <div
      onClick={() => setLike(!like)}
      style={{
        fontSize: '60px',
        cursor: 'pointer',
        color: like ? '#4caf50' : '#f44336',
        transition: '0.3s',
      }}
    >
      <FontAwesomeIcon icon={like ? faThumbsUp : faThumbsDown} />
    </div>
  );
}
