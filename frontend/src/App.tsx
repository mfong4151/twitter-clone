import React from 'react';
import {BrowserRouter, Route} from 'react-router-dom'
import './index.css'
import Home from './components/Home'

function App() {
  return (
    <div className='flex-direction-row'>
      <BrowserRouter>
        <Route path='/' element={<Home/>}/>
        
      </BrowserRouter>
      <div id='right'>


      </div>
      
    </div>
  );
}

export default App;
