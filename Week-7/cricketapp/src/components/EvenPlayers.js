import React from 'react';

const EvenPlayers = (IndianTeam) => {
  return (
    <div>
      {IndianTeam.filter((_, index) => index % 2 !== 0).map((player, index) => (
        <li key={index}>
          {['Second', 'Fourth', 'Sixth'][index]} : {player}
        </li>
      ))}
    </div>
  );
};

export default EvenPlayers;