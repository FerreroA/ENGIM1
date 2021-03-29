import {Genre} from './genre';
import {Actor} from './actor';

export interface Film {
  id: number;
  title: string;
  description: string;
  plot?: string;
  director: string;
  duration: string;
  release_year: number;
  cover_url?: string;
  tags: string;
  created_by: number;
  stars: number;
  actors: Actor[];
  genre: Genre[];
  votes: number[];
  vote?: number;
}
