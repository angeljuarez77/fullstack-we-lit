import React from 'react';

function Book(props) {
  return (
    <div>
      <h1>Title of book: { props.title }</h1>
      <h2>Author of book: { props.author }</h2>
      <h3>Relase date of book: { props.release }</h3>
    </div>
  )
}

export default Book;
