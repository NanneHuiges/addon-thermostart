# Changelog

## 1.1.1
- expose the /thermostat JSON API read-only (GET) on the direct port 3888, so Home Assistant
  can read it at a stable URL without the ingress prefix

## 1.1.0
- build from airwinb/thermostart (f517de6, server 2.0.1-rc1) instead of wichers/thermostart main;
  pinned to a commit so rebuilds are reproducible
- drop apt version pins (the pinned Debian versions are no longer available)
- optional tomorrow_apikey option for the outside temperature

## 1.0.4
- migrate to 7.6.2 base image

## 1.0.3
- fix for flask migrate

## 1.0.2
- added flask migrate

## 1.0.1
- fixed autologin - moved autologin variables to correct run

## 1.0.0

- Add autologin support
