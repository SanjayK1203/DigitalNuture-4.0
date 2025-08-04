import React from 'react';

const OddPlayers = (IndianTeam) => {
  return (
    <div>
      {IndianTeam.filter((_, index) => index % 2 === 0).map((player, index) => (
        <li key={index}>
          {['First', 'Third', 'Fifth'][index]} : {player}
        </li>
      ))}
    </div>
  );
};

export default OddPlayers;