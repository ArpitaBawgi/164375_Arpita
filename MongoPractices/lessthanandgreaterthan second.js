db.Movie.find({$or:[{"year":{$gt:2010}},{"year":{$lt:1990}}]})


