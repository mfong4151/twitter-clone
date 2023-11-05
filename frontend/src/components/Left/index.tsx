import React, {FC} from 'react';
import './left.css';
import '../../index.css'
import { NavLink } from 'react-router-dom';
interface Props{

}
const Left:FC<Props> = () => {


  return (
    <section id='left' className='section-h'>
      <nav>
        <ul>
          <li>
            <NavLink className='' to='/home'>X</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'> Home</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'> Explore</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Notifications</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Messages</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Lists</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Bookmarks</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Communites</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Verified</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>Profile</NavLink>
          </li>
          <li>
            <NavLink className='' to='/home'>More</NavLink>
          </li>
        </ul>
      </nav>
        
    </section>
  );
};

export default Left;