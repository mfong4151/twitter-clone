import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './index.css'
import Home from './components/Main'
import Left from './components/Left'
import Right from './components/Right'

function App() {
  return (
    <div className='flex flex-direction-row'>
      <BrowserRouter>

        <Left />

        <section id='mid' className='section-h'>
          <Routes>

            <Route path='/' element={<Home />} />
          </Routes>


        </section>
      </BrowserRouter>

      <Right>

      </Right>

    </div>

  );
}

export default App;
