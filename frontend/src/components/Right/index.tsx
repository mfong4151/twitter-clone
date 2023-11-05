import React, {FC, useState} from 'react';
import './right.css';
import '../../index.css'
import ShowMore from './ShowMore';

interface Props{

}
const Right:FC<Props> = () => {
  const [search, setSearch] = useState<string>('') 

  return (
    <section id='right' className='section-h flex-row'>
        <div className=' w-2/3 px-4 py-2 m-4 rounded-lg bg-zinc-500'>
          <input
            className='w-full bg-zinc-500'
            type='text'
           value={search}
           onChange={e => setSearch(e.target.value)}/>
        </div>

        <article>
          <h3>Subscribe to Premium</h3>
          <p className='py-2'>Subscript to unlock new features and if eligible, recieve a share of ads revenue.</p>
          <button className='bg-blue-500 px-4 py-1 rounded-3xl text-lg font-semibold'>
            Subscribe
          </button>
        </article>
        <article>
          <h3>What's happening</h3>
          <ShowMore/>
        </article>
        <article>
          <h3>Who to follow</h3>
          <ShowMore/>
        </article>

    </section>
  );
};

export default Right;